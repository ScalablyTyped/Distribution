package typings
package pbfLib.pbfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pbf extends js.Object {
  var buf: stdLib.Uint8Array = js.native
  var length: scala.Double = js.native
  var pos: scala.Double = js.native
  var `type`: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def finish(): stdLib.Uint8Array = js.native
  def readBoolean(): scala.Boolean = js.native
  def readBytes(): stdLib.Uint8Array = js.native
  def readDouble(): scala.Double = js.native
  def readFields[T](
    readField: js.Function3[
      /* tag */ scala.Double, 
      /* result */ js.UndefOr[T], 
      /* pbf */ js.UndefOr[this.type], 
      scala.Unit
    ]
  ): T = js.native
  def readFields[T](
    readField: js.Function3[
      /* tag */ scala.Double, 
      /* result */ js.UndefOr[T], 
      /* pbf */ js.UndefOr[this.type], 
      scala.Unit
    ],
    result: T
  ): T = js.native
  def readFields[T](
    readField: js.Function3[
      /* tag */ scala.Double, 
      /* result */ js.UndefOr[T], 
      /* pbf */ js.UndefOr[this.type], 
      scala.Unit
    ],
    result: T,
    end: scala.Double
  ): T = js.native
  def readFixed32(): scala.Double = js.native
  def readFixed64(): scala.Double = js.native
  def readFloat(): scala.Double = js.native
  def readMessage[T](
    readField: js.Function3[
      /* tag */ scala.Double, 
      /* result */ js.UndefOr[T], 
      /* pbf */ js.UndefOr[this.type], 
      scala.Unit
    ]
  ): T = js.native
  def readMessage[T](
    readField: js.Function3[
      /* tag */ scala.Double, 
      /* result */ js.UndefOr[T], 
      /* pbf */ js.UndefOr[this.type], 
      scala.Unit
    ],
    result: T
  ): T = js.native
  def readPackedBoolean(): js.Array[scala.Boolean] = js.native
  def readPackedBoolean(arr: js.Array[scala.Boolean]): js.Array[scala.Boolean] = js.native
  def readPackedDouble(): js.Array[scala.Double] = js.native
  def readPackedDouble(arr: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def readPackedFixed32(): js.Array[scala.Double] = js.native
  def readPackedFixed32(arr: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def readPackedFixed64(): js.Array[scala.Double] = js.native
  def readPackedFixed64(arr: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def readPackedFloat(): js.Array[scala.Double] = js.native
  def readPackedFloat(arr: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def readPackedSFixed32(): js.Array[scala.Double] = js.native
  def readPackedSFixed32(arr: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def readPackedSFixed64(): js.Array[scala.Double] = js.native
  def readPackedSFixed64(arr: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def readPackedSVarint(): js.Array[scala.Double] = js.native
  def readPackedSVarint(arr: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def readPackedVarint(): js.Array[scala.Double] = js.native
  def readPackedVarint(arr: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def readPackedVarint(arr: js.Array[scala.Double], isSigned: scala.Boolean): js.Array[scala.Double] = js.native
  def readSFixed32(): scala.Double = js.native
  def readSFixed64(): scala.Double = js.native
  def readSVarint(): scala.Double = js.native
  def readString(): java.lang.String = js.native
  def readVarint(): scala.Double = js.native
  def readVarint(isSigned: scala.Boolean): scala.Double = js.native
  def readVarint64(): scala.Double = js.native
  def realloc(min: scala.Double): scala.Unit = js.native
  def skip(`val`: scala.Double): scala.Unit = js.native
  def writeBoolean(`val`: scala.Boolean): scala.Unit = js.native
  def writeBooleanField(tag: scala.Double, `val`: scala.Boolean): scala.Unit = js.native
  def writeBytes(buffer: stdLib.Uint8Array): scala.Unit = js.native
  def writeBytesField(tag: scala.Double, buffer: stdLib.Uint8Array): scala.Unit = js.native
  def writeDouble(`val`: scala.Double): scala.Unit = js.native
  def writeDoubleField(tag: scala.Double, `val`: scala.Double): scala.Unit = js.native
  def writeFixed32(`val`: scala.Double): scala.Unit = js.native
  def writeFixed32Field(tag: scala.Double, `val`: scala.Double): scala.Unit = js.native
  def writeFixed64(`val`: scala.Double): scala.Unit = js.native
  def writeFixed64Field(tag: scala.Double, `val`: scala.Double): scala.Unit = js.native
  def writeFloat(`val`: scala.Double): scala.Unit = js.native
  def writeFloatField(tag: scala.Double, `val`: scala.Double): scala.Unit = js.native
  def writeMessage[T](tag: scala.Double, fn: js.Function2[/* obj */ T, /* pbf */ js.UndefOr[this.type], scala.Unit]): scala.Unit = js.native
  def writeMessage[T](
    tag: scala.Double,
    fn: js.Function2[/* obj */ T, /* pbf */ js.UndefOr[this.type], scala.Unit],
    obj: T
  ): scala.Unit = js.native
  def writePackedBoolean(tag: scala.Double, arr: js.Array[scala.Boolean]): scala.Unit = js.native
  def writePackedDouble(tag: scala.Double, arr: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedFixed32(tag: scala.Double, arr: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedFixed64(tag: scala.Double, arr: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedFloat(tag: scala.Double, arr: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedSFixed32(tag: scala.Double, arr: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedSFixed64(tag: scala.Double, arr: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedSVarint(tag: scala.Double, arr: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedVarint(tag: scala.Double, arr: js.Array[scala.Double]): scala.Unit = js.native
  def writeRawMessage[T](fn: js.Function2[/* obj */ T, /* pbf */ js.UndefOr[this.type], scala.Unit]): scala.Unit = js.native
  def writeRawMessage[T](fn: js.Function2[/* obj */ T, /* pbf */ js.UndefOr[this.type], scala.Unit], obj: T): scala.Unit = js.native
  def writeSFixed32(`val`: scala.Double): scala.Unit = js.native
  def writeSFixed32Field(tag: scala.Double, `val`: scala.Double): scala.Unit = js.native
  def writeSFixed64(`val`: scala.Double): scala.Unit = js.native
  def writeSFixed64Field(tag: scala.Double, `val`: scala.Double): scala.Unit = js.native
  def writeSVarint(`val`: scala.Double): scala.Unit = js.native
  def writeSVarintField(tag: scala.Double, `val`: scala.Double): scala.Unit = js.native
  def writeString(str: java.lang.String): scala.Unit = js.native
  def writeStringField(tag: scala.Double, str: java.lang.String): scala.Unit = js.native
  def writeTag(tag: scala.Double, `type`: scala.Double): scala.Unit = js.native
  def writeVarint(`val`: scala.Double): scala.Unit = js.native
  def writeVarintField(tag: scala.Double, `val`: scala.Double): scala.Unit = js.native
}

