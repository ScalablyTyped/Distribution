package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleKind extends StObject
@JSImport("monaco-editor", "languages.typescript.ModuleKind")
@js.native
object ModuleKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleKind & Double] = js.native
  
  @js.native
  sealed trait AMD
    extends StObject
       with ModuleKind
  /* 2 */ val AMD: typings.monacoEditor.mod.languages.typescript.ModuleKind.AMD & Double = js.native
  
  @js.native
  sealed trait CommonJS
    extends StObject
       with ModuleKind
  /* 1 */ val CommonJS: typings.monacoEditor.mod.languages.typescript.ModuleKind.CommonJS & Double = js.native
  
  @js.native
  sealed trait ES2015
    extends StObject
       with ModuleKind
  /* 5 */ val ES2015: typings.monacoEditor.mod.languages.typescript.ModuleKind.ES2015 & Double = js.native
  
  @js.native
  sealed trait ESNext
    extends StObject
       with ModuleKind
  /* 99 */ val ESNext: typings.monacoEditor.mod.languages.typescript.ModuleKind.ESNext & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ModuleKind
  /* 0 */ val None: typings.monacoEditor.mod.languages.typescript.ModuleKind.None & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with ModuleKind
  /* 4 */ val System: typings.monacoEditor.mod.languages.typescript.ModuleKind.System & Double = js.native
  
  @js.native
  sealed trait UMD
    extends StObject
       with ModuleKind
  /* 3 */ val UMD: typings.monacoEditor.mod.languages.typescript.ModuleKind.UMD & Double = js.native
}
