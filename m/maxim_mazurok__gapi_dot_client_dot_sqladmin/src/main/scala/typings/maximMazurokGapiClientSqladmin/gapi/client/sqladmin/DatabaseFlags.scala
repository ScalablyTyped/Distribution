package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseFlags extends StObject {
  
  /**
    * The name of the flag. These flags are passed at instance startup, so include both server options and system variables for MySQL. Flags are specified with underscores, not hyphens.
    * For more information, see Configuring Database Flags in the Cloud SQL documentation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The value of the flag. Booleans are set to *on* for true and *off* for false. This field must be omitted if the flag doesn't take a value. */
  var value: js.UndefOr[String] = js.undefined
}
object DatabaseFlags {
  
  @scala.inline
  def apply(): DatabaseFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseFlags]
  }
  
  @scala.inline
  implicit class DatabaseFlagsMutableBuilder[Self <: DatabaseFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
