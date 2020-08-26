package typings.pbf.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pbf extends js.Object {
  var buf: Uint8Array = js.native
  var length: Double = js.native
  var pos: Double = js.native
  var `type`: Double = js.native
  def destroy(): Unit = js.native
  def finish(): Uint8Array = js.native
  def readBoolean(): Boolean = js.native
  def readBytes(): Uint8Array = js.native
  def readDouble(): Double = js.native
  def readFields[T](
    readField: js.Function3[/* tag */ Double, /* result */ js.UndefOr[T], /* pbf */ js.UndefOr[this.type], Unit]
  ): T = js.native
  def readFields[T](
    readField: js.Function3[/* tag */ Double, /* result */ js.UndefOr[T], /* pbf */ js.UndefOr[this.type], Unit],
    result: T
  ): T = js.native
  def readFields[T](
    readField: js.Function3[/* tag */ Double, /* result */ js.UndefOr[T], /* pbf */ js.UndefOr[this.type], Unit],
    result: T,
    end: Double
  ): T = js.native
  def readFields[T](
    readField: js.Function3[/* tag */ Double, /* result */ js.UndefOr[T], /* pbf */ js.UndefOr[this.type], Unit],
    result: js.UndefOr[scala.Nothing],
    end: Double
  ): T = js.native
  def readFixed32(): Double = js.native
  def readFixed64(): Double = js.native
  def readFloat(): Double = js.native
  def readMessage[T](
    readField: js.Function3[/* tag */ Double, /* result */ js.UndefOr[T], /* pbf */ js.UndefOr[this.type], Unit]
  ): T = js.native
  def readMessage[T](
    readField: js.Function3[/* tag */ Double, /* result */ js.UndefOr[T], /* pbf */ js.UndefOr[this.type], Unit],
    result: T
  ): T = js.native
  def readPackedBoolean(): js.Array[Boolean] = js.native
  def readPackedBoolean(arr: js.Array[Boolean]): js.Array[Boolean] = js.native
  def readPackedDouble(): js.Array[Double] = js.native
  def readPackedDouble(arr: js.Array[Double]): js.Array[Double] = js.native
  def readPackedFixed32(): js.Array[Double] = js.native
  def readPackedFixed32(arr: js.Array[Double]): js.Array[Double] = js.native
  def readPackedFixed64(): js.Array[Double] = js.native
  def readPackedFixed64(arr: js.Array[Double]): js.Array[Double] = js.native
  def readPackedFloat(): js.Array[Double] = js.native
  def readPackedFloat(arr: js.Array[Double]): js.Array[Double] = js.native
  def readPackedSFixed32(): js.Array[Double] = js.native
  def readPackedSFixed32(arr: js.Array[Double]): js.Array[Double] = js.native
  def readPackedSFixed64(): js.Array[Double] = js.native
  def readPackedSFixed64(arr: js.Array[Double]): js.Array[Double] = js.native
  def readPackedSVarint(): js.Array[Double] = js.native
  def readPackedSVarint(arr: js.Array[Double]): js.Array[Double] = js.native
  def readPackedVarint(): js.Array[Double] = js.native
  def readPackedVarint(arr: js.UndefOr[scala.Nothing], isSigned: Boolean): js.Array[Double] = js.native
  def readPackedVarint(arr: js.Array[Double]): js.Array[Double] = js.native
  def readPackedVarint(arr: js.Array[Double], isSigned: Boolean): js.Array[Double] = js.native
  def readSFixed32(): Double = js.native
  def readSFixed64(): Double = js.native
  def readSVarint(): Double = js.native
  def readString(): String = js.native
  def readVarint(): Double = js.native
  def readVarint(isSigned: Boolean): Double = js.native
  def readVarint64(): Double = js.native
  def realloc(min: Double): Unit = js.native
  def skip(`val`: Double): Unit = js.native
  def writeBoolean(`val`: Boolean): Unit = js.native
  def writeBooleanField(tag: Double, `val`: Boolean): Unit = js.native
  def writeBytes(buffer: Uint8Array): Unit = js.native
  def writeBytesField(tag: Double, buffer: Uint8Array): Unit = js.native
  def writeDouble(`val`: Double): Unit = js.native
  def writeDoubleField(tag: Double, `val`: Double): Unit = js.native
  def writeFixed32(`val`: Double): Unit = js.native
  def writeFixed32Field(tag: Double, `val`: Double): Unit = js.native
  def writeFixed64(`val`: Double): Unit = js.native
  def writeFixed64Field(tag: Double, `val`: Double): Unit = js.native
  def writeFloat(`val`: Double): Unit = js.native
  def writeFloatField(tag: Double, `val`: Double): Unit = js.native
  def writeMessage[T](tag: Double, fn: js.Function2[/* obj */ T, /* pbf */ js.UndefOr[this.type], Unit]): Unit = js.native
  def writeMessage[T](tag: Double, fn: js.Function2[/* obj */ T, /* pbf */ js.UndefOr[this.type], Unit], obj: T): Unit = js.native
  def writePackedBoolean(tag: Double, arr: js.Array[Boolean]): Unit = js.native
  def writePackedDouble(tag: Double, arr: js.Array[Double]): Unit = js.native
  def writePackedFixed32(tag: Double, arr: js.Array[Double]): Unit = js.native
  def writePackedFixed64(tag: Double, arr: js.Array[Double]): Unit = js.native
  def writePackedFloat(tag: Double, arr: js.Array[Double]): Unit = js.native
  def writePackedSFixed32(tag: Double, arr: js.Array[Double]): Unit = js.native
  def writePackedSFixed64(tag: Double, arr: js.Array[Double]): Unit = js.native
  def writePackedSVarint(tag: Double, arr: js.Array[Double]): Unit = js.native
  def writePackedVarint(tag: Double, arr: js.Array[Double]): Unit = js.native
  def writeRawMessage[T](fn: js.Function2[/* obj */ T, /* pbf */ js.UndefOr[this.type], Unit]): Unit = js.native
  def writeRawMessage[T](fn: js.Function2[/* obj */ T, /* pbf */ js.UndefOr[this.type], Unit], obj: T): Unit = js.native
  def writeSFixed32(`val`: Double): Unit = js.native
  def writeSFixed32Field(tag: Double, `val`: Double): Unit = js.native
  def writeSFixed64(`val`: Double): Unit = js.native
  def writeSFixed64Field(tag: Double, `val`: Double): Unit = js.native
  def writeSVarint(`val`: Double): Unit = js.native
  def writeSVarintField(tag: Double, `val`: Double): Unit = js.native
  def writeString(str: String): Unit = js.native
  def writeStringField(tag: Double, str: String): Unit = js.native
  def writeTag(tag: Double, `type`: Double): Unit = js.native
  def writeVarint(`val`: Double): Unit = js.native
  def writeVarintField(tag: Double, `val`: Double): Unit = js.native
}

