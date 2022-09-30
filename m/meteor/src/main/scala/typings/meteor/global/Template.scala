package typings.meteor.global

import typings.jquery.JQueryStatic
import typings.meteor.Blaze.EventsMap
import typings.meteor.Blaze.HelpersMap
import typings.meteor.Blaze.TemplateInstance
import typings.meteor.Blaze.View
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Template")
@js.native
open class Template ()
  extends StObject
     with typings.meteor.Blaze.Template[Any, TemplateInstance[Any]] {
  def this(viewName: String) = this()
  def this(viewName: String, renderFunction: js.Function) = this()
  def this(viewName: Unit, renderFunction: js.Function) = this()
  
  /* CompleteClass */
  @JSName("$")
  var $: JQueryStatic = js.native
  
  /* CompleteClass */
  override def constructView(): View = js.native
  
  /* CompleteClass */
  var created: js.Function = js.native
  
  /* CompleteClass */
  var destroyed: js.Function = js.native
  
  /* CompleteClass */
  override def events(eventsMap: EventsMap[Any, TemplateInstance[Any]]): Unit = js.native
  
  /* CompleteClass */
  override def find(selector: String): HTMLElement = js.native
  
  /* CompleteClass */
  override def findAll(selector: String): js.Array[HTMLElement] = js.native
  
  /* CompleteClass */
  var head: typings.meteor.Blaze.Template[Any, TemplateInstance[Any]] = js.native
  
  /* CompleteClass */
  override def helpers(helpersMap: HelpersMap): Unit = js.native
  
  /**
    * Register a function to be called when an instance of this template is created.
    * @param callback A function to be added as a callback.
    */
  /* CompleteClass */
  override def onCreated(callback: js.ThisFunction0[TemplateInstance[Any], Any]): Unit = js.native
  
  /**
    * Register a function to be called when an instance of this template is removed from the DOM and destroyed.
    * @param callback A function to be added as a callback.
    */
  /* CompleteClass */
  override def onDestroyed(callback: js.ThisFunction0[TemplateInstance[Any], Any]): Unit = js.native
  
  /**
    * Register a function to be called when an instance of this template is inserted into the DOM.
    * @param callback A function to be added as a callback.
    */
  /* CompleteClass */
  override def onRendered(callback: js.ThisFunction0[TemplateInstance[Any], Any]): Unit = js.native
  
  /* CompleteClass */
  var renderFunction: js.Function = js.native
  
  /* CompleteClass */
  var rendered: js.Function = js.native
  
  /* CompleteClass */
  var viewName: String = js.native
}
/* Inlined meteor.TemplateStatic<any, meteor.Blaze.TemplateInstance<any>> & {[index: string] : any | meteor.Blaze.Template<any, meteor.Blaze.TemplateInstance<any>>} */
object Template {
  
  @JSGlobal("Template")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Template.body")
  @js.native
  def body: typings.meteor.Blaze.Template[Any, TemplateInstance[Any]] = js.native
  inline def body_=(x: typings.meteor.Blaze.Template[Any, TemplateInstance[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("body")(x.asInstanceOf[js.Any])
  
  inline def currentData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("currentData")().asInstanceOf[Any]
  
  inline def instance(): TemplateInstance[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[TemplateInstance[Any]]
  
  inline def parentData(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parentData")().asInstanceOf[Record[String, Any]]
  inline def parentData(numLevels: Double): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parentData")(numLevels.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def registerHelper(name: String, func: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
