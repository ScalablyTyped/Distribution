package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which may be used when getting SODA collection names.
  */
@js.native
trait SodaCollectionNamesOptions extends js.Object {
  
  /** Limits the number of names returned. If limit is 0 or undefined, then all collection names are returned. */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Returns names that start with the given string, and all subsequent names, in alphabetic order.
    * For example, if collections with names “cat”, “dog”, and “zebra” exist, then using startsWith of “d” will return
    * “dog” and “zebra”. If startsWith is an empty string or undefined, all collection names are returned, subject to the value of limit.
    */
  var startsWith: js.UndefOr[String] = js.native
}
object SodaCollectionNamesOptions {
  
  @scala.inline
  def apply(): SodaCollectionNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaCollectionNamesOptions]
  }
  
  @scala.inline
  implicit class SodaCollectionNamesOptionsOps[Self <: SodaCollectionNamesOptions] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setStartsWith(value: String): Self = this.set("startsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartsWith: Self = this.set("startsWith", js.undefined)
  }
}
