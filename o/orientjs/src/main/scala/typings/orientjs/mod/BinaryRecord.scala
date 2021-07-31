package typings.orientjs.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.Data
import typings.node.cryptoMod._KeyLike
import typings.node.fsMod._PathLike
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.IterableIterator
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.NumberDictionary because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- typings.std.Uint8Array because Inheritance from two classes. Inlined toStringTag, byteLength, buffer, BYTES_PER_ELEMENT, iterator, byteOffset, length, copyWithin, copyWithin, entries, every, every, filter, filter, find, find, findIndex, findIndex, forEach, forEach, join, join, keys, map, map, reduce, reduce, reduce, reduceRight, reduceRight, reduceRight, reverse, set, set, slice, slice, slice, slice, some, some, sort, sort, subarray, subarray, subarray, subarray, values
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typings.node.Buffer because Inheritance from two classes. Inlined compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, copy, copy, copy, copy, copy, copy, copy, copy, equals, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, includes, includes, includes, includes, includes, includes, includes, includes, includes, includes, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, readBigInt64BE, readBigInt64BE, readBigInt64LE, readBigInt64LE, readBigUInt64BE, readBigUInt64BE, readBigUInt64LE, readBigUInt64LE, readDoubleBE, readDoubleBE, readDoubleLE, readDoubleLE, readFloatBE, readFloatBE, readFloatLE, readFloatLE, readInt16BE, readInt16BE, readInt16LE, readInt16LE, readInt32BE, readInt32BE, readInt32LE, readInt32LE, readInt8, readInt8, readIntBE, readIntLE, readUInt16BE, readUInt16BE, readUInt16LE, readUInt16LE, readUInt32BE, readUInt32BE, readUInt32LE, readUInt32LE, readUInt8, readUInt8, readUIntBE, readUIntLE, swap16, swap32, swap64, toJSON, toString, toString, toString, toString, toString, toString, toString, write, write, write, write, write, write, writeBigInt64BE, writeBigInt64BE, writeBigInt64LE, writeBigInt64LE, writeBigUInt64BE, writeBigUInt64BE, writeBigUInt64LE, writeBigUInt64LE, writeDoubleBE, writeDoubleBE, writeDoubleLE, writeDoubleLE, writeFloatBE, writeFloatBE, writeFloatLE, writeFloatLE, writeInt16BE, writeInt16BE, writeInt16LE, writeInt16LE, writeInt32BE, writeInt32BE, writeInt32LE, writeInt32LE, writeInt8, writeInt8, writeIntBE, writeIntLE, writeUInt16BE, writeUInt16BE, writeUInt16LE, writeUInt16LE, writeUInt32BE, writeUInt32BE, writeUInt32LE, writeUInt32LE, writeUInt8, writeUInt8, writeUIntBE, writeUIntLE */ @js.native
trait BinaryRecord
  extends ORecord
     with _KeyLike
     with _PathLike {
  
  /**
    * The size in bytes of each element in the array.
    */
  val BYTES_PER_ELEMENT: Double = js.native
  
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  val buffer: ArrayBufferLike = js.native
  
  /**
    * The length in bytes of the array.
    */
  val byteLength: Double = js.native
  
  /**
    * The offset in bytes of the array.
    */
  val byteOffset: Double = js.native
  
  def compare(otherBuffer: Uint8Array): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double, targetEnd: Double): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double, targetEnd: Double, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Unit,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double, targetEnd: Unit, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Unit,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Unit,
    sourceStart: Unit,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Unit, targetEnd: Double): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Unit, targetEnd: Double, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Unit,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Unit,
    targetEnd: Double,
    sourceStart: Unit,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Unit, targetEnd: Unit, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Unit,
    targetEnd: Unit,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Unit, targetEnd: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
  
  def copy(targetBuffer: Uint8Array): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double, sourceStart: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Unit, sourceStart: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
  
  /**
    * Returns the this object after copying a section of the array identified by start and end
    * to the same array starting at position target
    * @param target If target is negative, it is treated as length+target where length is the
    * length of the array.
    * @param start If start is negative, it is treated as length+start. If end is negative, it
    * is treated as length+end.
    * @param end If not specified, length of the this object is used as its default value.
    */
  def copyWithin(target: Double, start: Double): this.type = js.native
  def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
  
  /**
    * Returns an array of key, value pairs for every entry in the array
    */
  def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
  
  def equals(otherBuffer: Uint8Array): Boolean = js.native
  
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param predicate A function that accepts up to three arguments. The every method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any]): Boolean = js.native
  def every(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any],
    thisArg: js.Any
  ): Boolean = js.native
  
  def fill(value: String): this.type = js.native
  def fill(value: String, offset: Double): this.type = js.native
  def fill(value: String, offset: Double, end: Double): this.type = js.native
  def fill(value: String, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: String, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: String, offset: Unit, end: Double): this.type = js.native
  def fill(value: String, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: String, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array): this.type = js.native
  def fill(value: Uint8Array, offset: Double): this.type = js.native
  def fill(value: Uint8Array, offset: Double, end: Double): this.type = js.native
  def fill(value: Uint8Array, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array, offset: Unit, end: Double): this.type = js.native
  def fill(value: Uint8Array, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param predicate A function that accepts up to three arguments. The filter method calls
    * the predicate function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any]): Uint8Array = js.native
  def filter(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any],
    thisArg: js.Any
  ): Uint8Array = js.native
  
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): js.UndefOr[Double] = js.native
  def find(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean],
    thisArg: js.Any
  ): js.UndefOr[Double] = js.native
  
  /**
    * Returns the index of the first element in the array where predicate is true, and -1
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found,
    * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean],
    thisArg: js.Any
  ): Double = js.native
  
  /**
    * Performs the specified action for each element in an array.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the
    * callbackfn function one time for each element in the array.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit],
    thisArg: js.Any
  ): Unit = js.native
  
  def includes(value: String): Boolean = js.native
  def includes(value: String, byteOffset: Double): Boolean = js.native
  def includes(value: String, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: String, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Double, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Double, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Buffer): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Buffer, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
  
  def indexOf(value: String): Double = js.native
  def indexOf(value: String, byteOffset: Double): Double = js.native
  def indexOf(value: String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: String, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Uint8Array): Double = js.native
  def indexOf(value: Uint8Array, byteOffset: Double): Double = js.native
  def indexOf(value: Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Uint8Array, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Double]] = js.native
  
  /**
    * Adds all the elements of an array separated by the specified separator string.
    * @param separator A string used to separate one element of an array from the next in the
    * resulting String. If omitted, the array elements are separated with a comma.
    */
  def join(): String = js.native
  def join(separator: String): String = js.native
  
  /**
    * Returns an list of keys in the array
    */
  def keys(): IterableIterator[Double] = js.native
  
  def lastIndexOf(value: String): Double = js.native
  def lastIndexOf(value: String, byteOffset: Double): Double = js.native
  def lastIndexOf(value: String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: String, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Uint8Array): Double = js.native
  def lastIndexOf(value: Uint8Array, byteOffset: Double): Double = js.native
  def lastIndexOf(value: Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Uint8Array, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  
  /**
    * The length of the array.
    */
  val length: Double = js.native
  
  /**
    * Calls a defined callback function on each element of an array, and returns an array that
    * contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the
    * callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def map(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double]): Uint8Array = js.native
  def map(
    callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double],
    thisArg: js.Any
  ): Uint8Array = js.native
  
  def readBigInt64BE(): js.BigInt = js.native
  def readBigInt64BE(offset: Double): js.BigInt = js.native
  
  def readBigInt64LE(): js.BigInt = js.native
  def readBigInt64LE(offset: Double): js.BigInt = js.native
  
  def readBigUInt64BE(): js.BigInt = js.native
  def readBigUInt64BE(offset: Double): js.BigInt = js.native
  
  def readBigUInt64LE(): js.BigInt = js.native
  def readBigUInt64LE(offset: Double): js.BigInt = js.native
  
  def readDoubleBE(): Double = js.native
  def readDoubleBE(offset: Double): Double = js.native
  
  def readDoubleLE(): Double = js.native
  def readDoubleLE(offset: Double): Double = js.native
  
  def readFloatBE(): Double = js.native
  def readFloatBE(offset: Double): Double = js.native
  
  def readFloatLE(): Double = js.native
  def readFloatLE(offset: Double): Double = js.native
  
  def readInt16BE(): Double = js.native
  def readInt16BE(offset: Double): Double = js.native
  
  def readInt16LE(): Double = js.native
  def readInt16LE(offset: Double): Double = js.native
  
  def readInt32BE(): Double = js.native
  def readInt32BE(offset: Double): Double = js.native
  
  def readInt32LE(): Double = js.native
  def readInt32LE(offset: Double): Double = js.native
  
  def readInt8(): Double = js.native
  def readInt8(offset: Double): Double = js.native
  
  def readIntBE(offset: Double, byteLength: Double): Double = js.native
  
  def readIntLE(offset: Double, byteLength: Double): Double = js.native
  
  def readUInt16BE(): Double = js.native
  def readUInt16BE(offset: Double): Double = js.native
  
  def readUInt16LE(): Double = js.native
  def readUInt16LE(offset: Double): Double = js.native
  
  def readUInt32BE(): Double = js.native
  def readUInt32BE(offset: Double): Double = js.native
  
  def readUInt32LE(): Double = js.native
  def readUInt32LE(offset: Double): Double = js.native
  
  def readUInt8(): Double = js.native
  def readUInt8(offset: Double): Double = js.native
  
  def readUIntBE(offset: Double, byteLength: Double): Double = js.native
  
  def readUIntLE(offset: Double, byteLength: Double): Double = js.native
  
  /**
    * Calls the specified callback function for all the elements in an array. The return value of
    * the callback function is the accumulated result, and is provided as an argument in the next
    * call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the
    * callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start
    * the accumulation. The first call to the callbackfn function provides this value as an argument
    * instead of an array value.
    */
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ]
  ): Double = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ],
    initialValue: Double
  ): Double = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of
    * the callback function is the accumulated result, and is provided as an argument in the next
    * call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the
    * callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start
    * the accumulation. The first call to the callbackfn function provides this value as an argument
    * instead of an array value.
    */
  def reduce[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      U
    ],
    initialValue: U
  ): U = js.native
  
  /**
    * Calls the specified callback function for all the elements in an array, in descending order.
    * The return value of the callback function is the accumulated result, and is provided as an
    * argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls
    * the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start
    * the accumulation. The first call to the callbackfn function provides this value as an
    * argument instead of an array value.
    */
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ]
  ): Double = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ],
    initialValue: Double
  ): Double = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order.
    * The return value of the callback function is the accumulated result, and is provided as an
    * argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls
    * the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start
    * the accumulation. The first call to the callbackfn function provides this value as an argument
    * instead of an array value.
    */
  def reduceRight[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      U
    ],
    initialValue: U
  ): U = js.native
  
  /**
    * Reverses the elements in an Array.
    */
  def reverse(): Uint8Array = js.native
  
  /**
    * Sets a value or an array of values.
    * @param array A typed or untyped array of values to set.
    * @param offset The index in the current array at which the values are to be written.
    */
  def set(array: ArrayLike[Double]): Unit = js.native
  def set(array: ArrayLike[Double], offset: Double): Unit = js.native
  
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
    */
  def slice(): Uint8Array = js.native
  def slice(start: Double): Uint8Array = js.native
  def slice(start: Double, end: Double): Uint8Array = js.native
  def slice(start: Unit, end: Double): Uint8Array = js.native
  
  /**
    * Determines whether the specified callback function returns true for any element of an array.
    * @param predicate A function that accepts up to three arguments. The some method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value true, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any]): Boolean = js.native
  def some(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any],
    thisArg: js.Any
  ): Boolean = js.native
  
  /**
    * Sorts an array.
    * @param compareFn Function used to determine the order of the elements. It is expected to return
    * a negative value if first argument is less than second argument, zero if they're equal and a positive
    * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
    * ```ts
    * [11,2,22,1].sort((a, b) => a - b)
    * ```
    */
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
  
  /**
    * Gets a new Uint8Array view of the ArrayBuffer store for this array, referencing the elements
    * at begin, inclusive, up to end, exclusive.
    * @param begin The index of the beginning of the array.
    * @param end The index of the end of the array.
    */
  def subarray(): Uint8Array = js.native
  def subarray(begin: Double): Uint8Array = js.native
  def subarray(begin: Double, end: Double): Uint8Array = js.native
  def subarray(begin: Unit, end: Double): Uint8Array = js.native
  
  def swap16(): Buffer = js.native
  
  def swap32(): Buffer = js.native
  
  def swap64(): Buffer = js.native
  
  def toJSON(): Data = js.native
  
  def toString(encoding: Unit, start: Double): String = js.native
  def toString(encoding: Unit, start: Double, end: Double): String = js.native
  def toString(encoding: Unit, start: Unit, end: Double): String = js.native
  def toString(encoding: BufferEncoding): String = js.native
  def toString(encoding: BufferEncoding, start: Double): String = js.native
  def toString(encoding: BufferEncoding, start: Double, end: Double): String = js.native
  def toString(encoding: BufferEncoding, start: Unit, end: Double): String = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.std.stdStrings.Uint8Array = js.native
  
  /**
    * Returns an list of values in the array
    */
  def values(): IterableIterator[Double] = js.native
  
  def write(string: String): Double = js.native
  def write(string: String, encoding: BufferEncoding): Double = js.native
  def write(string: String, offset: Double): Double = js.native
  def write(string: String, offset: Double, encoding: BufferEncoding): Double = js.native
  def write(string: String, offset: Double, length: Double): Double = js.native
  def write(string: String, offset: Double, length: Double, encoding: BufferEncoding): Double = js.native
  
  def writeBigInt64BE(value: js.BigInt): Double = js.native
  def writeBigInt64BE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigInt64LE(value: js.BigInt): Double = js.native
  def writeBigInt64LE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigUInt64BE(value: js.BigInt): Double = js.native
  def writeBigUInt64BE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeBigUInt64LE(value: js.BigInt): Double = js.native
  def writeBigUInt64LE(value: js.BigInt, offset: Double): Double = js.native
  
  def writeDoubleBE(value: Double): Double = js.native
  def writeDoubleBE(value: Double, offset: Double): Double = js.native
  
  def writeDoubleLE(value: Double): Double = js.native
  def writeDoubleLE(value: Double, offset: Double): Double = js.native
  
  def writeFloatBE(value: Double): Double = js.native
  def writeFloatBE(value: Double, offset: Double): Double = js.native
  
  def writeFloatLE(value: Double): Double = js.native
  def writeFloatLE(value: Double, offset: Double): Double = js.native
  
  def writeInt16BE(value: Double): Double = js.native
  def writeInt16BE(value: Double, offset: Double): Double = js.native
  
  def writeInt16LE(value: Double): Double = js.native
  def writeInt16LE(value: Double, offset: Double): Double = js.native
  
  def writeInt32BE(value: Double): Double = js.native
  def writeInt32BE(value: Double, offset: Double): Double = js.native
  
  def writeInt32LE(value: Double): Double = js.native
  def writeInt32LE(value: Double, offset: Double): Double = js.native
  
  def writeInt8(value: Double): Double = js.native
  def writeInt8(value: Double, offset: Double): Double = js.native
  
  def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeUInt16BE(value: Double): Double = js.native
  def writeUInt16BE(value: Double, offset: Double): Double = js.native
  
  def writeUInt16LE(value: Double): Double = js.native
  def writeUInt16LE(value: Double, offset: Double): Double = js.native
  
  def writeUInt32BE(value: Double): Double = js.native
  def writeUInt32BE(value: Double, offset: Double): Double = js.native
  
  def writeUInt32LE(value: Double): Double = js.native
  def writeUInt32LE(value: Double, offset: Double): Double = js.native
  
  def writeUInt8(value: Double): Double = js.native
  def writeUInt8(value: Double, offset: Double): Double = js.native
  
  def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
}
