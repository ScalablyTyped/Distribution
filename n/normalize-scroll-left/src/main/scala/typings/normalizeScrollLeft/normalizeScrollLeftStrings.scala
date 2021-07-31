package typings.normalizeScrollLeft

import typings.normalizeScrollLeft.mod.ScrollType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeScrollLeftStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ScrollType
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait indeterminate
    extends StObject
       with ScrollType
  @scala.inline
  def indeterminate: indeterminate = "indeterminate".asInstanceOf[indeterminate]
  
  @js.native
  sealed trait ltr extends StObject
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait negative
    extends StObject
       with ScrollType
  @scala.inline
  def negative: negative = "negative".asInstanceOf[negative]
  
  @js.native
  sealed trait reverse
    extends StObject
       with ScrollType
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait rtl extends StObject
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
}
