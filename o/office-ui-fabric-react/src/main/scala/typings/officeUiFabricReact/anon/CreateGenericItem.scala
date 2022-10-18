package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typings.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerSuggestionsProps
import typings.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
import typings.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDottypesMod.IPeoplePickerItemSelectedProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGenericItem extends StObject {
  
  var createGenericItem: js.Function2[/* name */ String, /* currentValidationState */ ValidationState, IGenericItemkeyKey] = js.native
  
  def onRenderItem(props: IPeoplePickerItemSelectedProps): Element = js.native
  
  def onRenderSuggestionsItem(personaProps: IPersonaProps): Element = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps, suggestionsProps: IBasePickerSuggestionsProps[Any]): Element = js.native
}
