package typings.pa11y

import typings.pa11y.mod.AccessibilityStandard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pa11yStrings {
  
  @scala.inline
  def Section508: Section508 = "Section508".asInstanceOf[Section508]
  
  @scala.inline
  def WCAG2A: WCAG2A = "WCAG2A".asInstanceOf[WCAG2A]
  
  @scala.inline
  def WCAG2AA: WCAG2AA = "WCAG2AA".asInstanceOf[WCAG2AA]
  
  @scala.inline
  def WCAG2AAA: WCAG2AAA = "WCAG2AAA".asInstanceOf[WCAG2AAA]
  
  @js.native
  sealed trait Section508 extends AccessibilityStandard
  
  @js.native
  sealed trait WCAG2A extends AccessibilityStandard
  
  @js.native
  sealed trait WCAG2AA extends AccessibilityStandard
  
  @js.native
  sealed trait WCAG2AAA extends AccessibilityStandard
}
