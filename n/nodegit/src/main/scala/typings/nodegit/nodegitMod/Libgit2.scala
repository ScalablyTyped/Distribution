package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Libgit2")
@js.native
class Libgit2 ()
  extends typings.nodegit.libDashGit2Mod.Libgit2

/* static members */
@JSImport("nodegit", "Libgit2")
@js.native
object Libgit2 extends js.Object {
  def features(): Double = js.native
  def init(): Double = js.native
  def opts(option: Double): Double = js.native
  def shutdown(): Double = js.native
  def version(major: Double, minor: Double, rev: Double): Unit = js.native
  type OPT = typings.nodegit.libDashGit2Mod.Libgit2.OPT
}

