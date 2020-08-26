package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/templating", JSImport.Namespace)
@js.native
object templatingMod extends js.Object {
  @js.native
  class Template ()
    extends typings.meteor.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
  }
  
  @js.native
  trait TemplateStatic
    extends typings.meteor.Blaze.TemplateStatic
       with /* index */ StringDictionary[js.Any | typings.meteor.Blaze.Template] {
    var body: typings.meteor.Blaze.Template = js.native
  }
  
  @js.native
  object Template
    extends TopLevel[typings.meteor.templatingMod.TemplateStatic]
  
}

