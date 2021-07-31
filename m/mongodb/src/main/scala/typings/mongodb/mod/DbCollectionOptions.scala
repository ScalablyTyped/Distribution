package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbCollectionOptions
  extends StObject
     with CommonOptions {
  
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object DbCollectionOptions {
  
  @scala.inline
  def apply(): DbCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbCollectionOptions]
  }
  
  @scala.inline
  implicit class DbCollectionOptionsMutableBuilder[Self <: DbCollectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPkFactory(value: js.Object): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReadConcern(value: ReadConcern): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
