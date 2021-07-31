package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerVersionRequestVersionOptions extends StObject {
  
  /** The name of the container version to be created. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The notes of the container version to be created. */
  var notes: js.UndefOr[String] = js.undefined
}
object CreateContainerVersionRequestVersionOptions {
  
  @scala.inline
  def apply(): CreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerVersionRequestVersionOptions]
  }
  
  @scala.inline
  implicit class CreateContainerVersionRequestVersionOptionsMutableBuilder[Self <: CreateContainerVersionRequestVersionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
  }
}
