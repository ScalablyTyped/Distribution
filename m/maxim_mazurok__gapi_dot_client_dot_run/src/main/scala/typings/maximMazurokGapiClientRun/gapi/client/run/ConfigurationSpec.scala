package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationSpec extends StObject {
  
  /** Template holds the latest specification for the Revision to be stamped out. */
  var template: js.UndefOr[RevisionTemplate] = js.native
}
object ConfigurationSpec {
  
  @scala.inline
  def apply(): ConfigurationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSpec]
  }
  
  @scala.inline
  implicit class ConfigurationSpecMutableBuilder[Self <: ConfigurationSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: RevisionTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
