package typings.mdarea

import typings.mdarea.mod.EditorAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mdareaStrings {
  
  @js.native
  sealed trait enter
    extends StObject
       with EditorAction
  inline def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait indent
    extends StObject
       with EditorAction
  inline def indent: indent = "indent".asInstanceOf[indent]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with EditorAction
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait outdent
    extends StObject
       with EditorAction
  inline def outdent: outdent = "outdent".asInstanceOf[outdent]
}
