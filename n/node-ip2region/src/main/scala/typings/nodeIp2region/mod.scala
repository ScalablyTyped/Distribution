package typings.nodeIp2region

import typings.nodeIp2region.anon.City
import typings.nodeIp2region.anon.DbPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-ip2region", JSImport.Namespace)
  @js.native
  //#endregion
  open class ^ ()
    extends StObject
       with IP2Region {
    def this(options: DbPath) = this()
    
    /**
      * Async of binarySearch.
      * @param ip The IP address to search for.
      * @param callBack The callBack function with two parameters, if successful,
      * err is null and result is `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
      */
    /* CompleteClass */
    override def binarySearch(ip: String, callBack: SearchCallback): Unit = js.native
    
    /**
      * Sync of binarySearch.
      * @param ip The IP address to search for.
      * @return A result something like `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
      */
    /* CompleteClass */
    override def binarySearchSync(ip: String): SearchResult = js.native
    
    /**
      * Async of btreeSearch.
      * @param ip The IP address to search for.
      * @param callBack The callBack function with two parameters, if successful,
      * err is null and result is `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
      */
    /* CompleteClass */
    override def btreeSearch(ip: String, callBack: SearchCallback): Unit = js.native
    
    /**
      * Sync of btreeSearch.
      * @param ip The IP address to search for.
      * @return A result something like `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
      */
    /* CompleteClass */
    override def btreeSearchSync(ip: String): SearchResult = js.native
    
    //#region Public Functions
    /**
      * Destroy the current file by closing it.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Async of MemorySearch.
      * @param ip
      */
    /* CompleteClass */
    override def memorySearch(ip: String, callBack: SearchCallback): Unit = js.native
    
    /**
      * Sync of MemorySearch.
      * @param ip
      */
    /* CompleteClass */
    override def memorySearchSync(ip: String): SearchResult = js.native
  }
  @JSImport("node-ip2region", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  //#region Static Functions
  // Single Instance
  /* static member */
  inline def create(): IP2Region = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IP2Region]
  inline def create(dbPath: String): IP2Region = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dbPath.asInstanceOf[js.Any]).asInstanceOf[IP2Region]
  
  /**
    * For backward compatibility
    */
  /* static member */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  trait IP2Region extends StObject {
    
    /**
      * Async of binarySearch.
      * @param ip The IP address to search for.
      * @param callBack The callBack function with two parameters, if successful,
      * err is null and result is `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
      */
    def binarySearch(ip: String, callBack: SearchCallback): Unit
    
    /**
      * Sync of binarySearch.
      * @param ip The IP address to search for.
      * @return A result something like `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
      */
    def binarySearchSync(ip: String): SearchResult
    
    /**
      * Async of btreeSearch.
      * @param ip The IP address to search for.
      * @param callBack The callBack function with two parameters, if successful,
      * err is null and result is `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
      */
    def btreeSearch(ip: String, callBack: SearchCallback): Unit
    
    /**
      * Sync of btreeSearch.
      * @param ip The IP address to search for.
      * @return A result something like `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
      */
    def btreeSearchSync(ip: String): SearchResult
    
    //#region Public Functions
    /**
      * Destroy the current file by closing it.
      */
    def destroy(): Unit
    
    /**
      * Async of MemorySearch.
      * @param ip
      */
    def memorySearch(ip: String, callBack: SearchCallback): Unit
    
    /**
      * Sync of MemorySearch.
      * @param ip
      */
    def memorySearchSync(ip: String): SearchResult
  }
  object IP2Region {
    
    inline def apply(
      binarySearch: (String, SearchCallback) => Unit,
      binarySearchSync: String => SearchResult,
      btreeSearch: (String, SearchCallback) => Unit,
      btreeSearchSync: String => SearchResult,
      destroy: () => Unit,
      memorySearch: (String, SearchCallback) => Unit,
      memorySearchSync: String => SearchResult
    ): IP2Region = {
      val __obj = js.Dynamic.literal(binarySearch = js.Any.fromFunction2(binarySearch), binarySearchSync = js.Any.fromFunction1(binarySearchSync), btreeSearch = js.Any.fromFunction2(btreeSearch), btreeSearchSync = js.Any.fromFunction1(btreeSearchSync), destroy = js.Any.fromFunction0(destroy), memorySearch = js.Any.fromFunction2(memorySearch), memorySearchSync = js.Any.fromFunction1(memorySearchSync))
      __obj.asInstanceOf[IP2Region]
    }
    
    extension [Self <: IP2Region](x: Self) {
      
      inline def setBinarySearch(value: (String, SearchCallback) => Unit): Self = StObject.set(x, "binarySearch", js.Any.fromFunction2(value))
      
      inline def setBinarySearchSync(value: String => SearchResult): Self = StObject.set(x, "binarySearchSync", js.Any.fromFunction1(value))
      
      inline def setBtreeSearch(value: (String, SearchCallback) => Unit): Self = StObject.set(x, "btreeSearch", js.Any.fromFunction2(value))
      
      inline def setBtreeSearchSync(value: String => SearchResult): Self = StObject.set(x, "btreeSearchSync", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setMemorySearch(value: (String, SearchCallback) => Unit): Self = StObject.set(x, "memorySearch", js.Any.fromFunction2(value))
      
      inline def setMemorySearchSync(value: String => SearchResult): Self = StObject.set(x, "memorySearchSync", js.Any.fromFunction1(value))
    }
  }
  
  type SearchCallback = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
    /* result */ SearchResult, 
    Unit
  ]
  
  type SearchResult = City | Null
}
