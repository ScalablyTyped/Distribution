package typings.officeDashUiDashFabricDashReact.libCommonDocPageDotTypesMod

import typings.officeDashUiDashFabricDashReact.Anon_Section
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocPageProps extends js.Object {
  /** Accessibility of the component as markdown string */
  var accessibility: js.UndefOr[String] = js.undefined
  /** If true, the component accepts all native props from elements specified in `nativePropsElement` */
  var allowNativeProps: js.UndefOr[Boolean] = js.undefined
  /** Override component name to use in the native props message */
  var allowNativePropsForComponentName: js.UndefOr[String] = js.undefined
  /** Best practice as markdown string */
  var bestPractices: js.UndefOr[String] = js.undefined
  /** Name of the component being documented */
  var componentName: String
  /** URL of the checked in component, should be somewhere on github.com */
  var componentUrl: String
  /** DON'Ts blurb as markdown string */
  var donts: js.UndefOr[String] = js.undefined
  /** DO's blurb as markdown string */
  var dos: js.UndefOr[String] = js.undefined
  /** Knobs that applies to all the examples */
  var exampleKnobs: js.UndefOr[Element] = js.undefined
  /** Array of examples, displayed in the order defined */
  var examples: js.UndefOr[js.Array[IExample]] = js.undefined
  /** Feedback section includes link to new issue page and displays Github issues */
  var isFeedbackVisible: js.UndefOr[Boolean] = js.undefined
  /** Passed through header visibility flag from the demo component page component */
  var isHeaderVisible: Boolean
  /**
    * JSON to populate the api reference tables
    */
  var jsonDocs: js.UndefOr[IPageJson] = js.undefined
  /**
    * Element(s) whose native props this component accepts (default div).
    * Only relevant if `allowNativeProps` is true.
    */
  var nativePropsElement: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Pass through other sections for ComponentPage */
  var otherSections: js.UndefOr[js.Array[Anon_Section]] = js.undefined
  /** Overview of the component as markdown string */
  var overview: js.UndefOr[String] = js.undefined
  /** Properties table(s) as markdown string */
  var propertiesTablesSources: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Related link
    * @deprecated No longer shown on ComponentPage
    */
  var related: js.UndefOr[Element] = js.undefined
  /** Title that goes into the header */
  var title: String
}

object IDocPageProps {
  @scala.inline
  def apply(
    componentName: String,
    componentUrl: String,
    isHeaderVisible: Boolean,
    title: String,
    accessibility: String = null,
    allowNativeProps: js.UndefOr[Boolean] = js.undefined,
    allowNativePropsForComponentName: String = null,
    bestPractices: String = null,
    donts: String = null,
    dos: String = null,
    exampleKnobs: Element = null,
    examples: js.Array[IExample] = null,
    isFeedbackVisible: js.UndefOr[Boolean] = js.undefined,
    jsonDocs: IPageJson = null,
    nativePropsElement: String | js.Array[String] = null,
    otherSections: js.Array[Anon_Section] = null,
    overview: String = null,
    propertiesTablesSources: js.Array[String] = null,
    related: Element = null
  ): IDocPageProps = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], componentUrl = componentUrl.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNativeProps)) __obj.updateDynamic("allowNativeProps")(allowNativeProps.asInstanceOf[js.Any])
    if (allowNativePropsForComponentName != null) __obj.updateDynamic("allowNativePropsForComponentName")(allowNativePropsForComponentName.asInstanceOf[js.Any])
    if (bestPractices != null) __obj.updateDynamic("bestPractices")(bestPractices.asInstanceOf[js.Any])
    if (donts != null) __obj.updateDynamic("donts")(donts.asInstanceOf[js.Any])
    if (dos != null) __obj.updateDynamic("dos")(dos.asInstanceOf[js.Any])
    if (exampleKnobs != null) __obj.updateDynamic("exampleKnobs")(exampleKnobs.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (!js.isUndefined(isFeedbackVisible)) __obj.updateDynamic("isFeedbackVisible")(isFeedbackVisible.asInstanceOf[js.Any])
    if (jsonDocs != null) __obj.updateDynamic("jsonDocs")(jsonDocs.asInstanceOf[js.Any])
    if (nativePropsElement != null) __obj.updateDynamic("nativePropsElement")(nativePropsElement.asInstanceOf[js.Any])
    if (otherSections != null) __obj.updateDynamic("otherSections")(otherSections.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (propertiesTablesSources != null) __obj.updateDynamic("propertiesTablesSources")(propertiesTablesSources.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocPageProps]
  }
}

