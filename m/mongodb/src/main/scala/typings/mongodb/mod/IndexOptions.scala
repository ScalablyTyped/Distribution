package typings.mongodb.mod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexOptions extends CommonOptions {
  /**
    * Creates the index in the background, yielding whenever possible.
    */
  var background: js.UndefOr[Boolean] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var default_language: js.UndefOr[String] = js.undefined
  /**
    * A unique index cannot be created on a key that has pre-existing duplicate values.
    *
    * If you would like to create the index anyway, keeping the first document the database indexes and
    * deleting all subsequent documents that have duplicate value
    */
  var dropDups: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows you to expire data on indexes applied to a data (MongoDB 2.2 or higher)
    */
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * For geo spatial indexes set the high bound for the co-ordinates.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * For geo spatial indexes set the lower bound for the co-ordinates.
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Override the auto generated index name (useful if the resulting name is larger than 128 bytes)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Creates a partial index based on the given filter object (MongoDB 3.2 or higher)
    */
  var partialFilterExpression: js.UndefOr[js.Any] = js.undefined
  /**
    * Creates a sparse index.
    */
  var sparse: js.UndefOr[Boolean] = js.undefined
  /**
    * Creates an unique index.
    */
  var unique: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the format version of the indexes.
    */
  var v: js.UndefOr[scala.Double] = js.undefined
}

object IndexOptions {
  @scala.inline
  def apply(
    background: js.UndefOr[Boolean] = js.undefined,
    collation: CollationDocument = null,
    default_language: String = null,
    dropDups: js.UndefOr[Boolean] = js.undefined,
    expireAfterSeconds: js.UndefOr[scala.Double] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[scala.Double] = js.undefined,
    min: js.UndefOr[scala.Double] = js.undefined,
    name: String = null,
    partialFilterExpression: js.Any = null,
    session: ClientSession = null,
    sparse: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined,
    v: js.UndefOr[scala.Double] = js.undefined,
    w: scala.Double | majority | String = null,
    wtimeout: js.UndefOr[scala.Double] = js.undefined
  ): IndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.get.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (default_language != null) __obj.updateDynamic("default_language")(default_language.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDups)) __obj.updateDynamic("dropDups")(dropDups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expireAfterSeconds)) __obj.updateDynamic("expireAfterSeconds")(expireAfterSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (partialFilterExpression != null) __obj.updateDynamic("partialFilterExpression")(partialFilterExpression.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexOptions]
  }
}

