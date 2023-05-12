package typings.nodeHashring

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A consistent hashing ring with replicas for more even distribution (virtual nodes) and binary
    * searching for best performance.
    *
    * This hashring uses the [MurmurHash algorithm](http://en.wikipedia.org/wiki/MurmurHash) which
    * creates a 32-bit integer as opposed to using something like a 128-bit MD5. Which means, in
    * comparison to an MD5 based hashring, this offers a lot more performance.
    */
  @JSImport("node-hashring", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HashRing {
    /**
      * This will create a hashring for two primary nodes,
      * by default each node will be comprised of 80 virtual nodes.
      *
      * @param nodes List of node names.
      * @param virtualNodes Number of replicas for more even distribution (virtual nodes).
      *
      * @example
      * import HashRing = require('node-hashring');
      * const hashRing = new HashRing([
      *   'server-address-1',
      *   'server-address-2',
      * ]);
      */
    def this(nodes: js.Array[String]) = this()
    def this(nodes: js.Array[String], /** @default 80 */
    virtualNodes: Double) = this()
    
    /**
      * Add a node to the ring.
      */
    /* CompleteClass */
    override def addNode(nodeId: String): Unit = js.native
    
    /* CompleteClass */
    override val assigned: StringDictionary[js.UndefOr[Double]] = js.native
    
    /**
      * Will generate a hash of the key and search for
      * the closet match greater than or equal to the key
      * to find the node index in the ring. Then it will
      * use the ring node address to lookup the actual
      * node in the virtual nodes map
      */
    /* CompleteClass */
    override def findNode(key: String): js.UndefOr[String] = js.native
    
    /**
      * Return a 32-bit unsigned integer.
      */
    /* CompleteClass */
    override def getHashValue(str: String): Double = js.native
    
    /* CompleteClass */
    override val nodeMap: StringDictionary[Double] = js.native
    
    /* CompleteClass */
    override val nodeSize: Double = js.native
    
    /* CompleteClass */
    override val nodes: js.Array[String] = js.native
    
    /**
      * Remove a node from the ring.
      */
    /* CompleteClass */
    override def removeNode(nodeId: String): Unit = js.native
    
    /* CompleteClass */
    override val ring: js.Array[String] = js.native
    
    /**
      * Perform a binary search to find the ring index
      * that contains the hashed key value.
      */
    /* CompleteClass */
    override def search(key: String): Double = js.native
    
    /* CompleteClass */
    override val virtualNodes: Double = js.native
    
    /* CompleteClass */
    override val vnodeToNodeMap: StringDictionary[String] = js.native
  }
  
  /* static member */
  @JSImport("node-hashring", "maxHashValue")
  @js.native
  val maxHashValue: /* 0xffffffff */ Double = js.native
  
  /**
    * A consistent hashing ring with replicas for more even distribution (virtual nodes) and binary
    * searching for best performance.
    *
    * This hashring uses the [MurmurHash algorithm](http://en.wikipedia.org/wiki/MurmurHash) which
    * creates a 32-bit integer as opposed to using something like a 128-bit MD5. Which means, in
    * comparison to an MD5 based hashring, this offers a lot more performance.
    */
  trait HashRing extends StObject {
    
    /**
      * Add a node to the ring.
      */
    def addNode(nodeId: String): Unit
    
    val assigned: StringDictionary[js.UndefOr[Double]]
    
    /**
      * Will generate a hash of the key and search for
      * the closet match greater than or equal to the key
      * to find the node index in the ring. Then it will
      * use the ring node address to lookup the actual
      * node in the virtual nodes map
      */
    def findNode(key: String): js.UndefOr[String]
    
    /**
      * Return a 32-bit unsigned integer.
      */
    def getHashValue(str: String): Double
    
    val nodeMap: StringDictionary[Double]
    
    val nodeSize: Double
    
    val nodes: js.Array[String]
    
    /**
      * Remove a node from the ring.
      */
    def removeNode(nodeId: String): Unit
    
    val ring: js.Array[String]
    
    /**
      * Perform a binary search to find the ring index
      * that contains the hashed key value.
      */
    def search(key: String): Double
    
    val virtualNodes: Double
    
    val vnodeToNodeMap: StringDictionary[String]
  }
  object HashRing {
    
    inline def apply(
      addNode: String => Unit,
      assigned: StringDictionary[js.UndefOr[Double]],
      findNode: String => js.UndefOr[String],
      getHashValue: String => Double,
      nodeMap: StringDictionary[Double],
      nodeSize: Double,
      nodes: js.Array[String],
      removeNode: String => Unit,
      ring: js.Array[String],
      search: String => Double,
      virtualNodes: Double,
      vnodeToNodeMap: StringDictionary[String]
    ): HashRing = {
      val __obj = js.Dynamic.literal(addNode = js.Any.fromFunction1(addNode), assigned = assigned.asInstanceOf[js.Any], findNode = js.Any.fromFunction1(findNode), getHashValue = js.Any.fromFunction1(getHashValue), nodeMap = nodeMap.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], removeNode = js.Any.fromFunction1(removeNode), ring = ring.asInstanceOf[js.Any], search = js.Any.fromFunction1(search), virtualNodes = virtualNodes.asInstanceOf[js.Any], vnodeToNodeMap = vnodeToNodeMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashRing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashRing] (val x: Self) extends AnyVal {
      
      inline def setAddNode(value: String => Unit): Self = StObject.set(x, "addNode", js.Any.fromFunction1(value))
      
      inline def setAssigned(value: StringDictionary[js.UndefOr[Double]]): Self = StObject.set(x, "assigned", value.asInstanceOf[js.Any])
      
      inline def setFindNode(value: String => js.UndefOr[String]): Self = StObject.set(x, "findNode", js.Any.fromFunction1(value))
      
      inline def setGetHashValue(value: String => Double): Self = StObject.set(x, "getHashValue", js.Any.fromFunction1(value))
      
      inline def setNodeMap(value: StringDictionary[Double]): Self = StObject.set(x, "nodeMap", value.asInstanceOf[js.Any])
      
      inline def setNodeSize(value: Double): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setRemoveNode(value: String => Unit): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
      
      inline def setRing(value: js.Array[String]): Self = StObject.set(x, "ring", value.asInstanceOf[js.Any])
      
      inline def setRingVarargs(value: String*): Self = StObject.set(x, "ring", js.Array(value*))
      
      inline def setSearch(value: String => Double): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setVirtualNodes(value: Double): Self = StObject.set(x, "virtualNodes", value.asInstanceOf[js.Any])
      
      inline def setVnodeToNodeMap(value: StringDictionary[String]): Self = StObject.set(x, "vnodeToNodeMap", value.asInstanceOf[js.Any])
    }
  }
}
