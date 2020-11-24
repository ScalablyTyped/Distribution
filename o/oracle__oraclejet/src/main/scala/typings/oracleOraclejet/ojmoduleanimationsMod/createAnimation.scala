package typings.oracleOraclejet.ojmoduleanimationsMod

import typings.oracleOraclejet.anon.Effect
import typings.oracleOraclejet.ojanimationMod.AnimationMethods
import typings.oracleOraclejet.ojmoduleElementMod.ModuleElementAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojmoduleanimations", "createAnimation")
@js.native
object createAnimation extends js.Object {
  
  def apply(oldViewEffect: Null, newViewEffect: Null, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def apply(oldViewEffect: Null, newViewEffect: Effect, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def apply(oldViewEffect: Null, newViewEffect: AnimationMethods, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def apply(oldViewEffect: Effect, newViewEffect: Null, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def apply(oldViewEffect: Effect, newViewEffect: Effect, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def apply(oldViewEffect: Effect, newViewEffect: AnimationMethods, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def apply(oldViewEffect: AnimationMethods, newViewEffect: Null, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def apply(oldViewEffect: AnimationMethods, newViewEffect: Effect, newViewOnTop: Boolean): ModuleElementAnimation = js.native
  def apply(oldViewEffect: AnimationMethods, newViewEffect: AnimationMethods, newViewOnTop: Boolean): ModuleElementAnimation = js.native
}
