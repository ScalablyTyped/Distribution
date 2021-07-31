package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which may be used when getting SODA collection names.
  */
trait SodaCollectionNamesOptions extends StObject {
  
  /** Limits the number of names returned. If limit is 0 or undefined, then all collection names are returned. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns names that start with the given string, and all subsequent names, in alphabetic order.
    * For example, if collections with names “cat”, “dog”, and “zebra” exist, then using startsWith of “d” will return
    * “dog” and “zebra”. If startsWith is an empty string or undefined, all collection names are returned, subject to the value of limit.
    */
  var startsWith: js.UndefOr[String] = js.undefined
}
object SodaCollectionNamesOptions {
  
  @scala.inline
  def apply(): SodaCollectionNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaCollectionNamesOptions]
  }
  
  @scala.inline
  implicit class SodaCollectionNamesOptionsMutableBuilder[Self <: SodaCollectionNamesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setStartsWith(value: String): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
  }
}
