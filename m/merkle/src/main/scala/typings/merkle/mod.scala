package typings.merkle

import typings.merkle.merkleStrings.md5
import typings.merkle.merkleStrings.none
import typings.merkle.merkleStrings.ripemd160
import typings.merkle.merkleStrings.sha1
import typings.merkle.merkleStrings.sha256
import typings.merkle.merkleStrings.sha512
import typings.merkle.merkleStrings.whirlpool
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(hashname: sha512 | sha256 | sha1 | md5 | ripemd160 | whirlpool | none): MerkleStream = ^.asInstanceOf[js.Dynamic].apply(hashname.asInstanceOf[js.Any]).asInstanceOf[MerkleStream]
  inline def apply(
    hashname: sha512 | sha256 | sha1 | md5 | ripemd160 | whirlpool | none,
    useUpperCaseForHash: Boolean
  ): MerkleStream = (^.asInstanceOf[js.Dynamic].apply(hashname.asInstanceOf[js.Any], useUpperCaseForHash.asInstanceOf[js.Any])).asInstanceOf[MerkleStream]
  
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait MerkleStream extends Transform {
    
    def async(leaves: js.Array[Any], callback: js.Function2[/* err */ String, /* tree */ MerkleTree, Unit]): Unit = js.native
    
    def json(): MerkleStream = js.native
    
    def sync(leaves: js.Array[Any]): MerkleTree = js.native
  }
  
  trait MerkleTree extends StObject {
    
    def depth(): Double
    
    def level(level: Double): js.UndefOr[Double]
    
    def levels(): Double
    
    def nodes(): Double
    
    def root(): String
  }
  object MerkleTree {
    
    inline def apply(
      depth: () => Double,
      level: Double => js.UndefOr[Double],
      levels: () => Double,
      nodes: () => Double,
      root: () => String
    ): MerkleTree = {
      val __obj = js.Dynamic.literal(depth = js.Any.fromFunction0(depth), level = js.Any.fromFunction1(level), levels = js.Any.fromFunction0(levels), nodes = js.Any.fromFunction0(nodes), root = js.Any.fromFunction0(root))
      __obj.asInstanceOf[MerkleTree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MerkleTree] (val x: Self) extends AnyVal {
      
      inline def setDepth(value: () => Double): Self = StObject.set(x, "depth", js.Any.fromFunction0(value))
      
      inline def setLevel(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "level", js.Any.fromFunction1(value))
      
      inline def setLevels(value: () => Double): Self = StObject.set(x, "levels", js.Any.fromFunction0(value))
      
      inline def setNodes(value: () => Double): Self = StObject.set(x, "nodes", js.Any.fromFunction0(value))
      
      inline def setRoot(value: () => String): Self = StObject.set(x, "root", js.Any.fromFunction0(value))
    }
  }
}
