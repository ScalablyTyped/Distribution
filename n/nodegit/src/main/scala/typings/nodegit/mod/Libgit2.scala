package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Libgit2")
@js.native
class Libgit2 ()
  extends typings.nodegit.libGit2Mod.Libgit2
/* static members */
object Libgit2 {
  
  @JSImport("nodegit", "Libgit2")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def features(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("features")().asInstanceOf[Double]
  
  @scala.inline
  def init(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Double]
  
  @scala.inline
  def opts(option: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("opts")(option.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def shutdown(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Double]
  
  @scala.inline
  def version(major: Double, minor: Double, rev: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("version")(major.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
