package typings.openui5.sap.ui

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.core.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.component")
@js.native
object component extends js.Object {
  /**
    * Creates a new instance of a <code>Component</code> or returns the instanceof an existing
    * <code>Component</code>.If you want to look up an existing <code>Component</code> you can callthis
    * function with a Component ID as parameter:<pre>  var oComponent =
    * sap.ui.component(sComponentId);</pre>To create a new instance of a component you pass a component
    * configurationobject into this function:<pre>  var oComponent = sap.ui.component({    name:
    * "my.Component",    url: "my/component/location",    id: "myCompId1"  });</pre>
    * @since 1.15.0
    * @param vConfig ID of an existing Component or the configuration object to create the Component
    * @returns the Component instance or a Promise in case of asynchronous loading
    */
  //  Creates a new instance of a Component or returns the instance of an existing Component.
  def apply(vConfig: String): Component | JQueryPromise[_] = js.native
  def apply(vConfig: js.Any): Component | JQueryPromise[_] = js.native
  def apply(vConfig: ComponentConfig): JQueryPromise[Component] | Component = js.native
}

