package typings.officeUiFabricReact.documentCardActivityTypesMod

import typings.officeUiFabricReact.documentCardActivityBaseMod.DocumentCardActivityBase
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActivityProps extends ClassAttributes[DocumentCardActivityBase] {
  /**
    * Describes the activity that has taken place, such as "Created Feb 23, 2016".
    */
  var activity: String
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardActivity]] = js.undefined
  /**
    * One or more people who are involved in this activity.
    */
  var people: js.Array[IDocumentCardActivityPerson]
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDocumentCardActivityProps {
  @scala.inline
  def apply(
    activity: String,
    people: js.Array[IDocumentCardActivityPerson],
    className: String = null,
    componentRef: IRefObject[IDocumentCardActivity] = null,
    key: Key = null,
    ref: LegacyRef[DocumentCardActivityBase] = null,
    styles: IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles] = null,
    theme: ITheme = null
  ): IDocumentCardActivityProps = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActivityProps]
  }
}

