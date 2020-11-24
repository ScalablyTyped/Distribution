package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleResolutionKind extends js.Object
@JSImport("monaco-editor", "languages.typescript.ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleResolutionKind with Double] = js.native
  
  @js.native
  sealed trait Classic extends ModuleResolutionKind
  /* 1 */ @js.native
  object Classic extends TopLevel[Classic with Double]
  
  @js.native
  sealed trait NodeJs extends ModuleResolutionKind
  /* 2 */ @js.native
  object NodeJs extends TopLevel[NodeJs with Double]
}
