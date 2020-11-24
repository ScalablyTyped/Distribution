package typings.nodeIp2region.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IP2Region extends js.Object {
  
  /**
    * Async of binarySearch.
    * @param ip The IP address to search for.
    * @param callBack The callBack function with two parameters, if successful,
    * err is null and result is `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
    */
  def binarySearch(ip: String, callBack: SearchCallback): Unit = js.native
  
  /**
    * Sync of binarySearch.
    * @param ip The IP address to search for.
    * @return A result something like `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
    */
  def binarySearchSync(ip: String): SearchResult = js.native
  
  /**
    * Async of btreeSearch.
    * @param ip The IP address to search for.
    * @param callBack The callBack function with two parameters, if successful,
    * err is null and result is `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
    */
  def btreeSearch(ip: String, callBack: SearchCallback): Unit = js.native
  
  /**
    * Sync of btreeSearch.
    * @param ip The IP address to search for.
    * @return A result something like `{ city: 2163, region: '中国|0|广东省|深圳市|阿里云' }`
    */
  def btreeSearchSync(ip: String): SearchResult = js.native
  
  //#region Public Functions
  /**
    * Destroy the current file by closing it.
    */
  def destroy(): Unit = js.native
  
  /**
    * Async of MemorySearch.
    * @param ip
    */
  def memorySearch(ip: String, callBack: SearchCallback): Unit = js.native
  
  /**
    * Sync of MemorySearch.
    * @param ip
    */
  def memorySearchSync(ip: String): SearchResult = js.native
}
object IP2Region {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IP2RegionOps[Self <: IP2Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinarySearch(value: (String, SearchCallback) => Unit): Self = this.set("binarySearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBinarySearchSync(value: String => SearchResult): Self = this.set("binarySearchSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBtreeSearch(value: (String, SearchCallback) => Unit): Self = this.set("btreeSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBtreeSearchSync(value: String => SearchResult): Self = this.set("btreeSearchSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMemorySearch(value: (String, SearchCallback) => Unit): Self = this.set("memorySearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMemorySearchSync(value: String => SearchResult): Self = this.set("memorySearchSync", js.Any.fromFunction1(value))
  }
}
