package typings.notie

import typings.notie.mod.AlertType
import typings.notie.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notieStrings {
  
  @js.native
  sealed trait a extends StObject
  inline def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait an extends StObject
  inline def an: an = "an".asInstanceOf[an]
  
  @js.native
  sealed trait bottom
    extends StObject
       with Position
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait error
    extends StObject
       with AlertType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with AlertType
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait n extends StObject
  inline def n: n = "n".asInstanceOf[n]
  
  @js.native
  sealed trait neutral
    extends StObject
       with AlertType
  inline def neutral: neutral = "neutral".asInstanceOf[neutral]
  
  @js.native
  sealed trait s extends StObject
  inline def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait success
    extends StObject
       with AlertType
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait top
    extends StObject
       with Position
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait warning
    extends StObject
       with AlertType
  inline def warning: warning = "warning".asInstanceOf[warning]
}
