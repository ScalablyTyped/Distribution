package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSpecification extends js.Object {
  var `2dsphereIndexVersion`: js.UndefOr[scala.Double] = js.undefined
  var background: js.UndefOr[Boolean] = js.undefined
  var bits: js.UndefOr[scala.Double] = js.undefined
  var bucketSize: js.UndefOr[scala.Double] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var default_language: js.UndefOr[String] = js.undefined
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.undefined
  var key: js.Object
  var language_override: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var partialFilterExpression: js.UndefOr[js.Object] = js.undefined
  var sparse: js.UndefOr[Boolean] = js.undefined
  var storageEngine: js.UndefOr[js.Object] = js.undefined
  var textIndexVersion: js.UndefOr[scala.Double] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
  var weights: js.UndefOr[js.Object] = js.undefined
}

object IndexSpecification {
  @scala.inline
  def apply(
    key: js.Object,
    `2dsphereIndexVersion`: Int | scala.Double = null,
    background: js.UndefOr[Boolean] = js.undefined,
    bits: Int | scala.Double = null,
    bucketSize: Int | scala.Double = null,
    collation: CollationDocument = null,
    default_language: String = null,
    expireAfterSeconds: Int | scala.Double = null,
    language_override: String = null,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    name: String = null,
    partialFilterExpression: js.Object = null,
    sparse: js.UndefOr[Boolean] = js.undefined,
    storageEngine: js.Object = null,
    textIndexVersion: Int | scala.Double = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    weights: js.Object = null
  ): IndexSpecification = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (`2dsphereIndexVersion` != null) __obj.updateDynamic("2dsphereIndexVersion")(`2dsphereIndexVersion`.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bits != null) __obj.updateDynamic("bits")(bits.asInstanceOf[js.Any])
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (default_language != null) __obj.updateDynamic("default_language")(default_language.asInstanceOf[js.Any])
    if (expireAfterSeconds != null) __obj.updateDynamic("expireAfterSeconds")(expireAfterSeconds.asInstanceOf[js.Any])
    if (language_override != null) __obj.updateDynamic("language_override")(language_override.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (partialFilterExpression != null) __obj.updateDynamic("partialFilterExpression")(partialFilterExpression.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.asInstanceOf[js.Any])
    if (storageEngine != null) __obj.updateDynamic("storageEngine")(storageEngine.asInstanceOf[js.Any])
    if (textIndexVersion != null) __obj.updateDynamic("textIndexVersion")(textIndexVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSpecification]
  }
}

