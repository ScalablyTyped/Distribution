package typings.mongodb.mod

import typings.mongodb.mongodbInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "WriteConcern")
@js.native
/**
  * Constructs a WriteConcern from the write concern properties.
  * @param w - request acknowledgment that the write operation has propagated to a specified number of mongod instances or to mongod instances with specified tags.
  * @param wtimeout - specify a time limit to prevent write operations from blocking indefinitely
  * @param j - request acknowledgment that the write operation has been written to the on-disk journal
  * @param fsync - equivalent to the j option
  */
open class WriteConcern () extends StObject {
  def this(w: W) = this()
  def this(w: Unit, wtimeout: scala.Double) = this()
  def this(w: W, wtimeout: scala.Double) = this()
  def this(w: Unit, wtimeout: scala.Double, j: Boolean) = this()
  def this(w: Unit, wtimeout: Unit, j: Boolean) = this()
  def this(w: W, wtimeout: scala.Double, j: Boolean) = this()
  def this(w: W, wtimeout: Unit, j: Boolean) = this()
  def this(w: Unit, wtimeout: scala.Double, j: Boolean, fsync: Boolean) = this()
  def this(w: Unit, wtimeout: scala.Double, j: Boolean, fsync: `1`) = this()
  def this(w: Unit, wtimeout: scala.Double, j: Unit, fsync: Boolean) = this()
  def this(w: Unit, wtimeout: scala.Double, j: Unit, fsync: `1`) = this()
  def this(w: Unit, wtimeout: Unit, j: Boolean, fsync: Boolean) = this()
  def this(w: Unit, wtimeout: Unit, j: Boolean, fsync: `1`) = this()
  def this(w: Unit, wtimeout: Unit, j: Unit, fsync: Boolean) = this()
  def this(w: Unit, wtimeout: Unit, j: Unit, fsync: `1`) = this()
  def this(w: W, wtimeout: scala.Double, j: Boolean, fsync: Boolean) = this()
  def this(w: W, wtimeout: scala.Double, j: Boolean, fsync: `1`) = this()
  def this(w: W, wtimeout: scala.Double, j: Unit, fsync: Boolean) = this()
  def this(w: W, wtimeout: scala.Double, j: Unit, fsync: `1`) = this()
  def this(w: W, wtimeout: Unit, j: Boolean, fsync: Boolean) = this()
  def this(w: W, wtimeout: Unit, j: Boolean, fsync: `1`) = this()
  def this(w: W, wtimeout: Unit, j: Unit, fsync: Boolean) = this()
  def this(w: W, wtimeout: Unit, j: Unit, fsync: `1`) = this()
  
  /** equivalent to the j option */
  var fsync: js.UndefOr[Boolean | `1`] = js.native
  
  /** request acknowledgment that the write operation has been written to the on-disk journal */
  var j: js.UndefOr[Boolean] = js.native
  
  /** request acknowledgment that the write operation has propagated to a specified number of mongod instances or to mongod instances with specified tags. */
  var w: js.UndefOr[W] = js.native
  
  /** specify a time limit to prevent write operations from blocking indefinitely */
  var wtimeout: js.UndefOr[scala.Double] = js.native
}
/* static members */
object WriteConcern {
  
  @JSImport("mongodb", "WriteConcern")
  @js.native
  val ^ : js.Any = js.native
  
  /** Construct a WriteConcern given an options object. */
  inline def fromOptions(): js.UndefOr[WriteConcern] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")().asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: Unit, inherit: WriteConcern): js.UndefOr[WriteConcern] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: Unit, inherit: WriteConcernOptions): js.UndefOr[WriteConcern] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: W): js.UndefOr[WriteConcern] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: W, inherit: WriteConcern): js.UndefOr[WriteConcern] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: W, inherit: WriteConcernOptions): js.UndefOr[WriteConcern] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: WriteConcern): js.UndefOr[WriteConcern] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: WriteConcernOptions): js.UndefOr[WriteConcern] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: WriteConcernOptions, inherit: WriteConcern): js.UndefOr[WriteConcern] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: WriteConcernOptions, inherit: WriteConcernOptions): js.UndefOr[WriteConcern] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: WriteConcern, inherit: WriteConcern): js.UndefOr[WriteConcern] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WriteConcern]]
  inline def fromOptions(options: WriteConcern, inherit: WriteConcernOptions): js.UndefOr[WriteConcern] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WriteConcern]]
}
