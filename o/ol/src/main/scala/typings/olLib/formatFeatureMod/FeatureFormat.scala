package typings
package olLib.formatFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFormat extends js.Object {
  var dataProjection: olLib.projProjectionMod.default = js.native
  var defaultFeatureProjection: olLib.projProjectionMod.default = js.native
  /* protected */ def adaptOptions(options: ReadOptions): WriteOptions | ReadOptions = js.native
  /* protected */ def adaptOptions(options: WriteOptions): WriteOptions | ReadOptions = js.native
  def getLastExtent(): olLib.extentMod.Extent = js.native
  /* protected */ def getReadOptions(source: java.lang.String): ReadOptions = js.native
  /* protected */ def getReadOptions(source: java.lang.String, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: org.scalablytyped.runtime.StringDictionary[js.Any]): ReadOptions = js.native
  /* protected */ def getReadOptions(source: org.scalablytyped.runtime.StringDictionary[js.Any], opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: stdLib.Document): ReadOptions = js.native
  /* protected */ def getReadOptions(source: stdLib.Document, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: stdLib.Node): ReadOptions = js.native
  /* protected */ def getReadOptions(source: stdLib.Node, opt_options: ReadOptions): ReadOptions = js.native
  def getType(): olLib.formatFormatTypeMod.FormatType = js.native
  def readFeature(source: java.lang.String): olLib.featureMod.FeatureLike = js.native
  def readFeature(source: java.lang.String, opt_options: ReadOptions): olLib.featureMod.FeatureLike = js.native
  def readFeature(source: org.scalablytyped.runtime.StringDictionary[js.Any]): olLib.featureMod.FeatureLike = js.native
  def readFeature(source: org.scalablytyped.runtime.StringDictionary[js.Any], opt_options: ReadOptions): olLib.featureMod.FeatureLike = js.native
  def readFeature(source: stdLib.Document): olLib.featureMod.FeatureLike = js.native
  def readFeature(source: stdLib.Document, opt_options: ReadOptions): olLib.featureMod.FeatureLike = js.native
  def readFeature(source: stdLib.Node): olLib.featureMod.FeatureLike = js.native
  def readFeature(source: stdLib.Node, opt_options: ReadOptions): olLib.featureMod.FeatureLike = js.native
  def readFeatures(source: java.lang.String): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: java.lang.String, opt_options: ReadOptions): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: org.scalablytyped.runtime.StringDictionary[js.Any], opt_options: ReadOptions): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: stdLib.ArrayBuffer): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: stdLib.ArrayBuffer, opt_options: ReadOptions): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: stdLib.Document): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: stdLib.Document, opt_options: ReadOptions): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: stdLib.Node): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readFeatures(source: stdLib.Node, opt_options: ReadOptions): js.Array[olLib.featureMod.FeatureLike] = js.native
  def readGeometry(source: java.lang.String): olLib.geomGeometryMod.default = js.native
  def readGeometry(source: java.lang.String, opt_options: ReadOptions): olLib.geomGeometryMod.default = js.native
  def readGeometry(source: org.scalablytyped.runtime.StringDictionary[js.Any]): olLib.geomGeometryMod.default = js.native
  def readGeometry(source: org.scalablytyped.runtime.StringDictionary[js.Any], opt_options: ReadOptions): olLib.geomGeometryMod.default = js.native
  def readGeometry(source: stdLib.Document): olLib.geomGeometryMod.default = js.native
  def readGeometry(source: stdLib.Document, opt_options: ReadOptions): olLib.geomGeometryMod.default = js.native
  def readGeometry(source: stdLib.Node): olLib.geomGeometryMod.default = js.native
  def readGeometry(source: stdLib.Node, opt_options: ReadOptions): olLib.geomGeometryMod.default = js.native
  def readProjection(source: java.lang.String): olLib.projProjectionMod.default = js.native
  def readProjection(source: org.scalablytyped.runtime.StringDictionary[js.Any]): olLib.projProjectionMod.default = js.native
  def readProjection(source: stdLib.Document): olLib.projProjectionMod.default = js.native
  def readProjection(source: stdLib.Node): olLib.projProjectionMod.default = js.native
  def writeFeature(feature: olLib.featureMod.default): java.lang.String = js.native
  def writeFeature(feature: olLib.featureMod.default, opt_options: WriteOptions): java.lang.String = js.native
  def writeFeatures(features: js.Array[olLib.featureMod.default]): java.lang.String = js.native
  def writeFeatures(features: js.Array[olLib.featureMod.default], opt_options: WriteOptions): java.lang.String = js.native
  def writeGeometry(geometry: olLib.geomGeometryMod.default): java.lang.String = js.native
  def writeGeometry(geometry: olLib.geomGeometryMod.default, opt_options: WriteOptions): java.lang.String = js.native
}

