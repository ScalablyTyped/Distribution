package typings.mendixmodelsdk.mod.codeactions

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "codeactions.StringTemplateParameterGrammar")
@js.native
open class StringTemplateParameterGrammar protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.codeactions.StringTemplateParameterGrammar {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object StringTemplateParameterGrammar {
  
  @JSImport("mendixmodelsdk", "codeactions.StringTemplateParameterGrammar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "codeactions.StringTemplateParameterGrammar.Sql")
  @js.native
  def Sql: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.StringTemplateParameterGrammar = js.native
  inline def Sql_=(x: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.StringTemplateParameterGrammar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sql")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "codeactions.StringTemplateParameterGrammar.Text")
  @js.native
  def Text: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.StringTemplateParameterGrammar = js.native
  inline def Text_=(x: typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.StringTemplateParameterGrammar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
}
