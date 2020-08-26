package typings.officeUiFabricReact.docPageTypesMod

import typings.officeUiFabricReact.anon.Section
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocPageProps extends js.Object {
  /** Accessibility of the component as markdown string */
  var accessibility: js.UndefOr[String] = js.native
  /** If true, the component accepts all native props from elements specified in `nativePropsElement` */
  var allowNativeProps: js.UndefOr[Boolean] = js.native
  /** Override component name to use in the native props message */
  var allowNativePropsForComponentName: js.UndefOr[String] = js.native
  /** Best practice as markdown string */
  var bestPractices: js.UndefOr[String] = js.native
  /** Name of the component being documented */
  var componentName: String = js.native
  /** URL of the checked in component, should be somewhere on github.com */
  var componentUrl: String = js.native
  /** DON'Ts blurb as markdown string */
  var donts: js.UndefOr[String] = js.native
  /** DO's blurb as markdown string */
  var dos: js.UndefOr[String] = js.native
  /** Knobs that applies to all the examples */
  var exampleKnobs: js.UndefOr[Element] = js.native
  /** Array of examples, displayed in the order defined */
  var examples: js.UndefOr[js.Array[IExample]] = js.native
  /** Feedback section includes link to new issue page and displays Github issues */
  var isFeedbackVisible: js.UndefOr[Boolean] = js.native
  /** Passed through header visibility flag from the demo component page component */
  var isHeaderVisible: Boolean = js.native
  /**
    * JSON to populate the api reference tables
    */
  var jsonDocs: js.UndefOr[IPageJson] = js.native
  /**
    * Element(s) whose native props this component accepts (default div).
    * Only relevant if `allowNativeProps` is true.
    */
  var nativePropsElement: js.UndefOr[String | js.Array[String]] = js.native
  /** Pass through other sections for ComponentPage */
  var otherSections: js.UndefOr[js.Array[Section]] = js.native
  /** Overview of the component as markdown string */
  var overview: js.UndefOr[String] = js.native
  /** Properties table(s) as markdown string */
  var propertiesTablesSources: js.UndefOr[js.Array[String]] = js.native
  /**
    * Related link
    * @deprecated No longer shown on ComponentPage
    */
  var related: js.UndefOr[Element] = js.native
  /** Title that goes into the header */
  var title: String = js.native
}

object IDocPageProps {
  @scala.inline
  def apply(componentName: String, componentUrl: String, isHeaderVisible: Boolean, title: String): IDocPageProps = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], componentUrl = componentUrl.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocPageProps]
  }
  @scala.inline
  implicit class IDocPagePropsOps[Self <: IDocPageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentUrl(value: String): Self = this.set("componentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHeaderVisible(value: Boolean): Self = this.set("isHeaderVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibility(value: String): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setAllowNativeProps(value: Boolean): Self = this.set("allowNativeProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNativeProps: Self = this.set("allowNativeProps", js.undefined)
    @scala.inline
    def setAllowNativePropsForComponentName(value: String): Self = this.set("allowNativePropsForComponentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNativePropsForComponentName: Self = this.set("allowNativePropsForComponentName", js.undefined)
    @scala.inline
    def setBestPractices(value: String): Self = this.set("bestPractices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBestPractices: Self = this.set("bestPractices", js.undefined)
    @scala.inline
    def setDonts(value: String): Self = this.set("donts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDonts: Self = this.set("donts", js.undefined)
    @scala.inline
    def setDos(value: String): Self = this.set("dos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDos: Self = this.set("dos", js.undefined)
    @scala.inline
    def setExampleKnobs(value: Element): Self = this.set("exampleKnobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExampleKnobs: Self = this.set("exampleKnobs", js.undefined)
    @scala.inline
    def setExamplesVarargs(value: IExample*): Self = this.set("examples", js.Array(value :_*))
    @scala.inline
    def setExamples(value: js.Array[IExample]): Self = this.set("examples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    @scala.inline
    def setIsFeedbackVisible(value: Boolean): Self = this.set("isFeedbackVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFeedbackVisible: Self = this.set("isFeedbackVisible", js.undefined)
    @scala.inline
    def setJsonDocs(value: IPageJson): Self = this.set("jsonDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonDocs: Self = this.set("jsonDocs", js.undefined)
    @scala.inline
    def setNativePropsElementVarargs(value: String*): Self = this.set("nativePropsElement", js.Array(value :_*))
    @scala.inline
    def setNativePropsElement(value: String | js.Array[String]): Self = this.set("nativePropsElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativePropsElement: Self = this.set("nativePropsElement", js.undefined)
    @scala.inline
    def setOtherSectionsVarargs(value: Section*): Self = this.set("otherSections", js.Array(value :_*))
    @scala.inline
    def setOtherSections(value: js.Array[Section]): Self = this.set("otherSections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherSections: Self = this.set("otherSections", js.undefined)
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    @scala.inline
    def setPropertiesTablesSourcesVarargs(value: String*): Self = this.set("propertiesTablesSources", js.Array(value :_*))
    @scala.inline
    def setPropertiesTablesSources(value: js.Array[String]): Self = this.set("propertiesTablesSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertiesTablesSources: Self = this.set("propertiesTablesSources", js.undefined)
    @scala.inline
    def setRelated(value: Element): Self = this.set("related", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
  }
  
}

