package typings.openui5.global.sap.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.resource")
@js.native
object resource extends js.Object {
  
  /**
    * Returns the URL of a resource that belongs to the given library and has the given relative location
    * within the library.This is mainly meant for static resources like images that are inside the
    * library.It is NOT meant for access to JavaScript modules or anything for which a different URL has
    * been registered with jQuery.sap.registerModulePath(). Forthese cases use
    * jQuery.sap.getModulePath().It DOES work, however, when the given sResourcePath starts with "themes/"
    * (= when it is a theme-dependent resource). Even when for this theme a differentlocation outside the
    * normal library location is configured.
    * @param sLibraryName the name of a library, like "sap.ui.commons"
    * @param sResourcePath the relative path of a resource inside this library, like "img/mypic.png" or
    * "themes/my_theme/img/mypic.png"
    * @returns the URL of the requested resource
    */
  def apply(sLibraryName: String, sResourcePath: String): String = js.native
}
