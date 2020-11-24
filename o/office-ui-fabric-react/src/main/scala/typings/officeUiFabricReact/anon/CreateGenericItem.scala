package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGenericItem extends js.Object {
  
  var createGenericItem: js.Function2[/* name */ String, /* currentValidationState */ ValidationState, IGenericItemkeyKey] = js.native
  
  def onRenderItem(props: IPeoplePickerItemSelectedProps): Element = js.native
  
  def onRenderSuggestionsItem(personaProps: IPersonaProps): Element = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps, suggestionsProps: IBasePickerSuggestionsProps[_]): Element = js.native
}
