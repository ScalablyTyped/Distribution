package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndexOptions extends CommonOptions {
  /**
       * Creates the index in the background, yielding whenever possible.
       */
  var background: js.UndefOr[scala.Boolean] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var default_language: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A unique index cannot be created on a key that has pre-existing duplicate values.
       *
       * If you would like to create the index anyway, keeping the first document the database indexes and
       * deleting all subsequent documents that have duplicate value
       */
  var dropDups: js.UndefOr[scala.Boolean] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Creates a partial index based on the given filter object (MongoDB 3.2 or higher)
       */
  var partialFilterExpression: js.UndefOr[js.Any] = js.undefined
  /**
       * Creates a sparse index.
       */
  var sparse: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Creates an unique index.
       */
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specify the format version of the indexes.
       */
  var v: js.UndefOr[scala.Double] = js.undefined
}

