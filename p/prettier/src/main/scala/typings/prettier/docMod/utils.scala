package typings.prettier.docMod

import typings.prettier.mod.Doc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("prettier/doc", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isEmpty(doc: Doc_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isLineNext(doc: Doc_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLineNext")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def mapDoc[T](doc: Doc_, callback: js.Function1[/* doc */ Doc_, T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mapDoc")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def propagateBreaks(doc: Doc_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateBreaks")(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeLines(doc: Doc_): Doc_ = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLines")(doc.asInstanceOf[js.Any]).asInstanceOf[Doc_]
  
  @scala.inline
  def stripTrailingHardline(doc: Doc_): Doc_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTrailingHardline")(doc.asInstanceOf[js.Any]).asInstanceOf[Doc_]
  
  @scala.inline
  def traverseDoc(doc: Doc_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def traverseDoc(doc: Doc_, onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc_, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc_, Unit],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], shouldTraverseConditionalGroups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: Unit,
    shouldTraverseConditionalGroups: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], shouldTraverseConditionalGroups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDoc(doc: Doc_, onEnter: Unit, onExit: js.Function1[/* doc */ Doc_, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDoc(
    doc: Doc_,
    onEnter: Unit,
    onExit: js.Function1[/* doc */ Doc_, Unit],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], shouldTraverseConditionalGroups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDoc(doc: Doc_, onEnter: Unit, onExit: Unit, shouldTraverseConditionalGroups: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDoc")(doc.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], shouldTraverseConditionalGroups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def willBreak(doc: Doc_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("willBreak")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
