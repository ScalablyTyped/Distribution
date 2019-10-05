package typings.openui5.sap.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.template")
@js.native
object template extends js.Object {
  //  Creates a Template for the given id, dom reference or a configuration object.
  def apply(): js.Any = js.native
  /**
    * Creates a Template for the given id, dom reference or a configuration object.If no parameter is
    * defined this function makes a lookup of DOM elementswhich are specifying a type attribute. If the
    * value of this type attributematches an registered type then the content of this DOM element will
    * beused to create a new <code>Template</code> instance.If you want to lookup all kind of existing and
    * known templates and parse themdirectly you can simply call:<pre>  sap.ui.template();</pre>To parse a
    * concrete DOM element you can do so by using this function in thefollowing way:<pre> 
    * sap.ui.template("theTemplateId");</pre>Or you can pass the reference to a DOM element and use this
    * DOM element asa source for the template:<pre>  sap.ui.template(oDomRef);</pre>The last option to use
    * this function is to pass the information via aconfiguration object. This configuration object can be
    * used to pass acontext for the templating framework when compiling the template:<pre>  var
    * oTemplateById = sap.ui.template({    id: "theTemplateId",    context: { ... }  });  var
    * oTemplateByDomRef = sap.ui.template({    domref: oDomRef,    context: { ... }  });</pre>It can also
    * be used to load a template from another file:<pre>  var oTemplate = sap.ui.template({    id:
    * "myTemplate",    src: "myTemplate.tmpl"  });  var oTemplateWithContext = sap.ui.template({    id:
    * "myTemplate",    src: "myTemplate.tmpl",    context: { ... }  });</pre>The properties of the
    * configuration object are the following:<ul><li><code>id</code> - the ID of the Template / the ID  of
    * the DOM element containing the source of the Template</li><li><code>domref</code> - the DOM element
    * containing the source of the Template</li><li><code>type</code> - the type of the
    * Template</li><li><code>src</code> - the URL to lookup the template</li>
    * (<i>experimental!</i>)<li><code>control</code> - the fully qualified name of the control to
    * declare</li> (<i>experimental!</i>)</ul>
    * @param oTemplate the id or the DOM reference to the template to lookup or an configuration object
    * containing the src, type and eventually the id of the Template.
    * @returns the created Template instance        or in case of usage without parametes any array of
    * templates is returned
    */
  def apply(oTemplate: String): js.Any | js.Array[_] = js.native
  def apply(oTemplate: js.Any): js.Any | js.Array[_] = js.native
}

