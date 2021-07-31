package typings.preactCustomElement

import typings.preact.mod.ComponentClass
import typings.preact.mod.FunctionComponent
import typings.preact.mod.FunctionalComponent
import typings.preactCustomElement.anon.Shadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(componentDefinition: FunctionComponent[js.Any] | FunctionalComponent[js.Any], tagName: String): Unit = (^.asInstanceOf[js.Dynamic].apply(componentDefinition.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    componentDefinition: FunctionComponent[js.Any] | FunctionalComponent[js.Any],
    tagName: String,
    observedAttributes: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(componentDefinition.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], observedAttributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    componentDefinition: FunctionComponent[js.Any] | FunctionalComponent[js.Any],
    tagName: String,
    observedAttributes: js.Array[String],
    options: Shadow
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(componentDefinition.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], observedAttributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    componentDefinition: FunctionComponent[js.Any] | FunctionalComponent[js.Any],
    tagName: String,
    observedAttributes: Unit,
    options: Shadow
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(componentDefinition.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], observedAttributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(componentDefinition: ComponentClass[js.Any, js.Object], tagName: String): Unit = (^.asInstanceOf[js.Dynamic].apply(componentDefinition.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    componentDefinition: ComponentClass[js.Any, js.Object],
    tagName: String,
    observedAttributes: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(componentDefinition.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], observedAttributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    componentDefinition: ComponentClass[js.Any, js.Object],
    tagName: String,
    observedAttributes: js.Array[String],
    options: Shadow
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(componentDefinition.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], observedAttributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    componentDefinition: ComponentClass[js.Any, js.Object],
    tagName: String,
    observedAttributes: Unit,
    options: Shadow
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(componentDefinition.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], observedAttributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("preact-custom-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
