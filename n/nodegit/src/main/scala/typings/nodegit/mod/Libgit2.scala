package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Libgit2")
@js.native
class Libgit2 ()
  extends typings.nodegit.libGit2Mod.Libgit2
/* static members */
@JSImport("nodegit", "Libgit2")
@js.native
object Libgit2 extends js.Object {
  
  def features(): Double = js.native
  
  def init(): Double = js.native
  
  def opts(option: Double): Double = js.native
  
  def shutdown(): Double = js.native
  
  def version(major: Double, minor: Double, rev: Double): Unit = js.native
}
