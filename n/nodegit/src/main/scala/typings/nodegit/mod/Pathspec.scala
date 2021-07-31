package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Pathspec")
@js.native
class Pathspec ()
  extends typings.nodegit.pathSpecMod.Pathspec
/* static members */
object Pathspec {
  
  @JSImport("nodegit", "Pathspec")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(pathspec: String): typings.nodegit.pathSpecMod.Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[typings.nodegit.pathSpecMod.Pathspec]
  @scala.inline
  def create(pathspec: js.Array[String]): typings.nodegit.pathSpecMod.Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[typings.nodegit.pathSpecMod.Pathspec]
  @scala.inline
  def create(pathspec: typings.nodegit.strArrayMod.Strarray): typings.nodegit.pathSpecMod.Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[typings.nodegit.pathSpecMod.Pathspec]
  
  @scala.inline
  def matchListDiffEntry(m: js.Any, pos: Double): typings.nodegit.diffDeltaMod.DiffDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListDiffEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[typings.nodegit.diffDeltaMod.DiffDelta]
  
  @scala.inline
  def matchListEntry(m: js.Any, pos: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def matchListEntrycount(m: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("matchListEntrycount")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def matchListFailedEntry(m: js.Any, pos: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListFailedEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def matchListFailedEntrycount(m: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("matchListFailedEntrycount")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
}
