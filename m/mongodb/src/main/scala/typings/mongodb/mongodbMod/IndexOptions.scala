package typings.mongodb.mongodbMod

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
    expireAfterSeconds: Int | scala.Double = null,
    j: js.UndefOr[Boolean] = js.undefined,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    name: String = null,
    partialFilterExpression: js.Any = null,
    session: ClientSession = null,
    sparse: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined,
    v: Int | scala.Double = null,
    w: scala.Double | majority | String = null,
    wtimeout: Int | scala.Double = null
  ): IndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (default_language != null) __obj.updateDynamic("default_language")(default_language.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDups)) __obj.updateDynamic("dropDups")(dropDups.asInstanceOf[js.Any])
    if (expireAfterSeconds != null) __obj.updateDynamic("expireAfterSeconds")(expireAfterSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (partialFilterExpression != null) __obj.updateDynamic("partialFilterExpression")(partialFilterExpression.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexOptions]
  }
}

