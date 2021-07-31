package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Blaze.EventsMap
import typings.meteor.Blaze.HelpersMap
import typings.meteor.Blaze.View
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatingMod {
  
  @JSImport("meteor/templating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("meteor/templating", "Template")
  @js.native
  class Template ()
    extends StObject
       with typings.meteor.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
    def this(viewName: Unit, renderFunction: js.Function) = this()
    
    /* CompleteClass */
    @JSName("$")
    var $: js.Any = js.native
    
    /* CompleteClass */
    override def constructView(): View = js.native
    
    /* CompleteClass */
    var created: js.Function = js.native
    
    /* CompleteClass */
    var destroyed: js.Function = js.native
    
    /* CompleteClass */
    override def events(eventsMap: EventsMap): Unit = js.native
    
    /* CompleteClass */
    override def find(selector: String): HTMLElement = js.native
    
    /* CompleteClass */
    override def findAll(selector: String): js.Array[HTMLElement] = js.native
    
    /* CompleteClass */
    var head: typings.meteor.Blaze.Template = js.native
    
    /* CompleteClass */
    override def helpers(helpersMap: HelpersMap): Unit = js.native
    
    /* CompleteClass */
    override def onCreated(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onDestroyed(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onRendered(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    var renderFunction: js.Function = js.native
    
    /* CompleteClass */
    var rendered: js.Function = js.native
    
    /* CompleteClass */
    var viewName: String = js.native
  }
  @JSImport("meteor/templating", "Template")
  @js.native
  def Template: typings.meteor.templatingMod.TemplateStatic = js.native
  @scala.inline
  def Template_=(x: typings.meteor.templatingMod.TemplateStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Template")(x.asInstanceOf[js.Any])
  
  @js.native
  trait TemplateStatic
    extends StObject
       with typings.meteor.Blaze.TemplateStatic
       with /* index */ StringDictionary[js.Any | typings.meteor.Blaze.Template] {
    
    var body: typings.meteor.Blaze.Template = js.native
  }
}
