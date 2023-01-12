package typings.mimos

import org.scalablytyped.runtime.StringDictionary
import typings.mimeDb.mod.MimeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait MimosOptions extends StObject {
    
    /**
      * an object hash that is merged into the built in mime information specified here {@link https://github.com/jshttp/mime-db}. Each key value pair represents a single mime object. Each override value should follow this schema:
      *  * the key is the lower-cased correct mime-type. (Ex. "application/javascript").
      *  * the value should an object @see MimosOptionsValue
      */
    var `override`: StringDictionary[MimosOptionsValue]
  }
  object MimosOptions {
    
    inline def apply(`override`: StringDictionary[MimosOptionsValue]): MimosOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MimosOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MimosOptions] (val x: Self) extends AnyVal {
      
      inline def setOverride(value: StringDictionary[MimosOptionsValue]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    }
  }
  
  trait MimosOptionsValue
    extends StObject
       with MimeEntry {
    
    /** method with signature function(mime) when this mime type is found in the database, this function will run. This allows you make customizations to mime based on developer criteria. */
    var predicate: js.UndefOr[js.Function1[/* mime */ this.type, this.type]] = js.undefined
    
    /** specify the type value of result objects, defaults to key. See the example below for more clarification. */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MimosOptionsValue {
    
    inline def apply(): MimosOptionsValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimosOptionsValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MimosOptionsValue] (val x: Self) extends AnyVal {
      
      inline def setPredicate(value: MimosOptionsValue => MimosOptionsValue): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
