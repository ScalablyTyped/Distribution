package typings
package parchmentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Register extends js.Object {
  var Attributor: Anon_Class
  var Block: ScalablyTyped.runtime.Instantiable0[parchmentLib.distSrcBlotBlockMod.default]
  var Container: ScalablyTyped.runtime.Instantiable1[/* domNode */ stdLib.Node, parchmentLib.distSrcBlotAbstractContainerMod.default]
  var Embed: ScalablyTyped.runtime.Instantiable0[parchmentLib.distSrcBlotEmbedMod.default]
  var Format: ScalablyTyped.runtime.Instantiable1[/* domNode */ stdLib.Node, parchmentLib.distSrcBlotAbstractFormatMod.default]
  var Inline: ScalablyTyped.runtime.Instantiable0[parchmentLib.distSrcBlotInlineMod.default]
  var Leaf: ScalablyTyped.runtime.Instantiable0[parchmentLib.distSrcBlotAbstractLeafMod.default]
  var Scope: js.Any
  var Scroll: ScalablyTyped.runtime.Instantiable1[/* node */ stdLib.HTMLDivElement, parchmentLib.distSrcBlotScrollMod.default]
  var Text: ScalablyTyped.runtime.Instantiable1[/* node */ stdLib.Node, parchmentLib.distSrcBlotTextMod.default]
  var create: js.Function2[
    /* input */ stdLib.Node | java.lang.String | parchmentLib.distSrcRegistryMod.Scope, 
    /* value */ js.UndefOr[js.Any], 
    parchmentLib.distSrcBlotAbstractBlotMod.Blot
  ]
  var find: js.Function2[
    /* node */ stdLib.Node | scala.Null, 
    /* bubble */ js.UndefOr[scala.Boolean], 
    parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null
  ]
  var query: js.Function2[
    /* query */ java.lang.String | stdLib.Node | parchmentLib.distSrcRegistryMod.Scope, 
    /* scope */ js.UndefOr[parchmentLib.distSrcRegistryMod.Scope], 
    parchmentLib.distSrcAttributorAttributorMod.default | parchmentLib.distSrcRegistryMod.BlotConstructor | scala.Null
  ]
  var register: js.Function1[/* repeated */js.Any, _]
}

