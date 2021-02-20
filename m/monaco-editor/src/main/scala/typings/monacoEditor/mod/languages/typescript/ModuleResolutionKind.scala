package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleResolutionKind extends StObject
@JSImport("monaco-editor", "languages.typescript.ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleResolutionKind with Double] = js.native
  
  @js.native
  sealed trait Classic extends ModuleResolutionKind
  /* 1 */ val Classic: typings.monacoEditor.mod.languages.typescript.ModuleResolutionKind.Classic with Double = js.native
  
  @js.native
  sealed trait NodeJs extends ModuleResolutionKind
  /* 2 */ val NodeJs: typings.monacoEditor.mod.languages.typescript.ModuleResolutionKind.NodeJs with Double = js.native
}
