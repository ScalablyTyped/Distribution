package typings.openui5.sap.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.localResources")
@js.native
object localResources extends js.Object {
  /**
    * Redirects access to resources that are part of the given namespace to a locationrelative to the
    * assumed <b>application root folder</b>.Any UI5 managed resource (view, controller, control,
    * JavaScript module, CSS file, etc.)whose resource name starts with <code>sNamespace</code>, will be
    * loaded from anequally named subfolder of the <b>application root folder</b>.If the resource name
    * consists of multiple segments (separated by a dot), each segmentis assumed to represent an
    * individual folder. In other words: when a resource name isconverted to an URL, any dots ('.') are
    * converted to slashes ('/').<b>Limitation:</b> For the time being, the <b>application root folder</b>
    * is assumed to bethe same as the folder where the current page resides in.Usage sample:<pre>  // Let
    * UI5 know that resources, whose name starts with "com.mycompany.myapp"  // should be loaded from the
    * URL location "./com/mycompany/myapp"  sap.ui.localResources("com.mycompany.myapp");  // The
    * following call implicitly will use the mapping done by the previous line  // It will load a view
    * from ./com/mycompany/myapp/views/Main.view.xml  sap.ui.view({ view :
    * "com.mycompany.myapp.views.Main", type : sap.ui.core.mvc.ViewType.XML});</pre>When applications need
    * a more flexible mapping between resource names and their location,they can use {@link
    * jQuery.sap.registerModulePath}.It is intended to make this configuration obsolete in future
    * releases, but for the timebeing, applications must call this method when they want to store
    * resources relative tothe assumed application root folder.
    * @param sNamespace Namespace prefix for which to load resources relative to the application root
    * folder
    */
  def apply(sNamespace: String): Unit = js.native
}

