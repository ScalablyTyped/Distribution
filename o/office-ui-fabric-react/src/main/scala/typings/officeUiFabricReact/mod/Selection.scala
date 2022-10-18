package typings.officeUiFabricReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection because Already inherited
- typings.uifabricUtilities.libSelectionSelectionMod.Selection because Already inherited
- typings.uifabricUtilities.libSelectionMod.Selection because Already inherited
- typings.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection because Already inherited
- typings.uifabricUtilities.mod.Selection because Already inherited
- typings.uifabricUtilities.libSelectionSelectionMod.Selection because Already inherited
- typings.officeUiFabricReact.libUtilitiesSelectionSelectionMod.Selection because Already inherited
- typings.uifabricUtilities.libSelectionMod.Selection because Already inherited
- typings.officeUiFabricReact.libUtilitiesSelectionMod.Selection because Already inherited
- typings.uifabricUtilities.mod.Selection because Already inherited
- typings.officeUiFabricReact.libMarqueeSelectionMod.Selection because Inheritance from two classes. Inlined 
- typings.officeUiFabricReact.libSelectionMod.Selection because Inheritance from two classes. Inlined 
- typings.officeUiFabricReact.libUtilitiesMod.Selection because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "Selection")
@js.native
open class Selection[TItem] protected ()
  extends typings.officeUiFabricReact.libDetailsListMod.Selection[TItem] {
  /**
    * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
    * object with a `getKey` implementation. Providing options is optional otherwise.
    * (At most one `options` object is accepted.)
    */
  def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: /* import warning: importer.ImportType#apply Failed type conversion: TItem extends @uifabric/utilities.@uifabric/utilities/lib/selection/Selection.types.IObjectWithKey ? [] | [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem>] : [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptionsWithRequiredGetKey<TItem>] */ js.Any) = this()
}
