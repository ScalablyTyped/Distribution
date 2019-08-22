package typings.officeDashJsDashPreview.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The DocumentCreated object is the top level object created by Application.CreateDocument. A DocumentCreated object is a special Document object.
  *
  * [Api set: WordApi 1.3]
  */
trait DocumentCreatedLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc..
    *
    * [Api set: WordApiHiddenDocument 1.3]
    * @beta
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
    *
    * Gets the properties of the document.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    * @beta
    */
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.undefined
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    * @beta
    */
  var saved: js.UndefOr[Boolean] = js.undefined
}

object DocumentCreatedLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    body: BodyLoadOptions = null,
    properties: DocumentPropertiesLoadOptions = null,
    saved: js.UndefOr[Boolean] = js.undefined
  ): DocumentCreatedLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (body != null) __obj.updateDynamic("body")(body)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(saved)) __obj.updateDynamic("saved")(saved)
    __obj.asInstanceOf[DocumentCreatedLoadOptions]
  }
}

