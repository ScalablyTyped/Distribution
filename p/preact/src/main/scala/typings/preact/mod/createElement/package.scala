package typings.preact.mod.createElement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//
// Preact createElement
// -----------------------------------
@scala.inline
def apply(
  `type`: java.lang.String,
  props: typings.preact.jsxMod.JSXInternal.HTMLAttributes[typings.std.EventTarget] & typings.preact.jsxMod.JSXInternal.SVGAttributes[typings.std.SVGElement] & (typings.std.Record[java.lang.String, js.Any]),
  children: typings.preact.mod.ComponentChildren*
): typings.preact.mod.VNode[js.Any] = (typings.preact.mod.createElement.^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.preact.mod.VNode[js.Any]]
@scala.inline
def apply(`type`: java.lang.String, props: scala.Null, children: typings.preact.mod.ComponentChildren*): typings.preact.mod.VNode[js.Any] = (typings.preact.mod.createElement.^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.preact.mod.VNode[js.Any]]
@scala.inline
def apply[P](
  `type`: typings.preact.mod.ComponentType[P],
  props: typings.preact.mod.Attributes & P,
  children: typings.preact.mod.ComponentChildren*
): typings.preact.mod.VNode[js.Any] = (typings.preact.mod.createElement.^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.preact.mod.VNode[js.Any]]
@scala.inline
def apply[P](
  `type`: typings.preact.mod.ComponentType[P],
  props: scala.Null,
  children: typings.preact.mod.ComponentChildren*
): typings.preact.mod.VNode[js.Any] = (typings.preact.mod.createElement.^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.preact.mod.VNode[js.Any]]
