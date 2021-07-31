package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides ways to load properties of only a subset of members of a collection.
  */
trait CollectionLoadOptions extends StObject {
  
  /**
    * Specify the number of items in the collection that are to be skipped and not included in the result. If top is specified, the selection of result will start after skipping the specified number of items.
    */
  @JSName("$skip")
  var $skip: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify the number of items in the queried collection to be included in the result.
    */
  @JSName("$top")
  var $top: js.UndefOr[Double] = js.undefined
}
object CollectionLoadOptions {
  
  @scala.inline
  def apply(): CollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionLoadOptions]
  }
  
  @scala.inline
  implicit class CollectionLoadOptionsMutableBuilder[Self <: CollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$skip(value: Double): Self = StObject.set(x, "$skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$skipUndefined: Self = StObject.set(x, "$skip", js.undefined)
    
    @scala.inline
    def set$top(value: Double): Self = StObject.set(x, "$top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$topUndefined: Self = StObject.set(x, "$top", js.undefined)
  }
}
