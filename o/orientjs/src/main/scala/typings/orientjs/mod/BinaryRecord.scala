package typings.orientjs.mod

import typings.node.anon.Data
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.cryptoMod._KeyLike
import typings.node.fsMod._PathLike
import typings.node.nodeInts.`-1`
import typings.node.nodeInts.`0`
import typings.node.nodeInts.`1`
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.IterableIterator
import typings.std.stdStrings.Uint8Array
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
- typings.std.Uint8Array because Inheritance from two classes. Inlined toStringTag, byteLength, buffer, BYTES_PER_ELEMENT, iterator, byteOffset, length, at, copyWithin, copyWithin, entries, every, every, filter, filter, find, find, findIndex, findIndex, forEach, forEach, join, join, keys, map, map, reduce, reduce, reduce, reduceRight, reduceRight, reduceRight, reverse, set, set, slice, slice, slice, slice, some, some, sort, sort, subarray, subarray, subarray, subarray, values
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typings.node.bufferMod.global.Buffer because Inheritance from two classes. Inlined compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, compare, copy, copy, copy, copy, copy, copy, copy, copy, equals, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, fill, includes, includes, includes, includes, includes, includes, includes, includes, includes, includes, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, indexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, lastIndexOf, readBigInt64BE, readBigInt64BE, readBigInt64LE, readBigInt64LE, readBigUInt64BE, readBigUInt64BE, readBigUInt64LE, readBigUInt64LE, readBigUint64BE, readBigUint64BE, readBigUint64LE, readBigUint64LE, readDoubleBE, readDoubleBE, readDoubleLE, readDoubleLE, readFloatBE, readFloatBE, readFloatLE, readFloatLE, readInt16BE, readInt16BE, readInt16LE, readInt16LE, readInt32BE, readInt32BE, readInt32LE, readInt32LE, readInt8, readInt8, readIntBE, readIntLE, readUInt16BE, readUInt16BE, readUInt16LE, readUInt16LE, readUInt32BE, readUInt32BE, readUInt32LE, readUInt32LE, readUInt8, readUInt8, readUIntBE, readUIntLE, readUint16BE, readUint16BE, readUint16LE, readUint16LE, readUint32BE, readUint32BE, readUint32LE, readUint32LE, readUint8, readUint8, readUintBE, readUintLE, swap16, swap32, swap64, toJSON, toString, toString, toString, toString, toString, toString, toString, write, write, write, write, write, write, writeBigInt64BE, writeBigInt64BE, writeBigInt64LE, writeBigInt64LE, writeBigUInt64BE, writeBigUInt64BE, writeBigUInt64LE, writeBigUInt64LE, writeBigUint64BE, writeBigUint64BE, writeBigUint64LE, writeBigUint64LE, writeDoubleBE, writeDoubleBE, writeDoubleLE, writeDoubleLE, writeFloatBE, writeFloatBE, writeFloatLE, writeFloatLE, writeInt16BE, writeInt16BE, writeInt16LE, writeInt16LE, writeInt32BE, writeInt32BE, writeInt32LE, writeInt32LE, writeInt8, writeInt8, writeIntBE, writeIntLE, writeUInt16BE, writeUInt16BE, writeUInt16LE, writeUInt16LE, writeUInt32BE, writeUInt32BE, writeUInt32LE, writeUInt32LE, writeUInt8, writeUInt8, writeUIntBE, writeUIntLE, writeUint16BE, writeUint16BE, writeUint16LE, writeUint16LE, writeUint32BE, writeUint32BE, writeUint32LE, writeUint32LE, writeUint8, writeUint8, writeUintBE, writeUintLE */ @js.native
trait BinaryRecord
  extends ORecord
     with _KeyLike
     with _PathLike {
  
  /**
    * The size in bytes of each element in the array.
    */
  /* standard es5 */
  val BYTES_PER_ELEMENT: Double = js.native
  
  /**
    * Returns the item located at the specified index.
    * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
    */
  /* standard es2022.array */
  def at(index: Double): js.UndefOr[Double] = js.native
  
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  /* standard es5 */
  val buffer: ArrayBufferLike = js.native
  
  /**
    * The length in bytes of the array.
    */
  /* standard es5 */
  val byteLength: Double = js.native
  
  /**
    * The offset in bytes of the array.
    */
  /* standard es5 */
  val byteOffset: Double = js.native
  
  /**
    * Compares `buf` with `target` and returns a number indicating whether `buf`comes before, after, or is the same as `target` in sort order.
    * Comparison is based on the actual sequence of bytes in each `Buffer`.
    *
    * * `0` is returned if `target` is the same as `buf`
    * * `1` is returned if `target` should come _before_`buf` when sorted.
    * * `-1` is returned if `target` should come _after_`buf` when sorted.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf1 = Buffer.from('ABC');
    * const buf2 = Buffer.from('BCD');
    * const buf3 = Buffer.from('ABCD');
    *
    * console.log(buf1.compare(buf1));
    * // Prints: 0
    * console.log(buf1.compare(buf2));
    * // Prints: -1
    * console.log(buf1.compare(buf3));
    * // Prints: -1
    * console.log(buf2.compare(buf1));
    * // Prints: 1
    * console.log(buf2.compare(buf3));
    * // Prints: 1
    * console.log([buf1, buf2, buf3].sort(Buffer.compare));
    * // Prints: [ <Buffer 41 42 43>, <Buffer 41 42 43 44>, <Buffer 42 43 44> ]
    * // (This result is equal to: [buf1, buf3, buf2].)
    * ```
    *
    * The optional `targetStart`, `targetEnd`, `sourceStart`, and `sourceEnd`arguments can be used to limit the comparison to specific ranges within `target`and `buf` respectively.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf1 = Buffer.from([1, 2, 3, 4, 5, 6, 7, 8, 9]);
    * const buf2 = Buffer.from([5, 6, 7, 8, 9, 1, 2, 3, 4]);
    *
    * console.log(buf1.compare(buf2, 5, 9, 0, 4));
    * // Prints: 0
    * console.log(buf1.compare(buf2, 0, 6, 4));
    * // Prints: -1
    * console.log(buf1.compare(buf2, 5, 6, 5));
    * // Prints: 1
    * ```
    *
    * `ERR_OUT_OF_RANGE` is thrown if `targetStart < 0`, `sourceStart < 0`,`targetEnd > target.byteLength`, or `sourceEnd > source.byteLength`.
    * @since v0.11.13
    * @param target A `Buffer` or {@link Uint8Array} with which to compare `buf`.
    * @param [targetStart=0] The offset within `target` at which to begin comparison.
    * @param [targetEnd=target.length] The offset within `target` at which to end comparison (not inclusive).
    * @param [sourceStart=0] The offset within `buf` at which to begin comparison.
    * @param [sourceEnd=buf.length] The offset within `buf` at which to end comparison (not inclusive).
    */
  def compare(target: js.typedarray.Uint8Array): `-1` | `0` | `1` = js.native
  def compare(target: js.typedarray.Uint8Array, targetStart: Double): `-1` | `0` | `1` = js.native
  def compare(target: js.typedarray.Uint8Array, targetStart: Double, targetEnd: Double): `-1` | `0` | `1` = js.native
  def compare(target: js.typedarray.Uint8Array, targetStart: Double, targetEnd: Double, sourceStart: Double): `-1` | `0` | `1` = js.native
  def compare(
    target: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): `-1` | `0` | `1` = js.native
  def compare(
    target: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Unit,
    sourceEnd: Double
  ): `-1` | `0` | `1` = js.native
  def compare(target: js.typedarray.Uint8Array, targetStart: Double, targetEnd: Unit, sourceStart: Double): `-1` | `0` | `1` = js.native
  def compare(
    target: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: Unit,
    sourceStart: Double,
    sourceEnd: Double
  ): `-1` | `0` | `1` = js.native
  def compare(
    target: js.typedarray.Uint8Array,
    targetStart: Double,
    targetEnd: Unit,
    sourceStart: Unit,
    sourceEnd: Double
  ): `-1` | `0` | `1` = js.native
  def compare(target: js.typedarray.Uint8Array, targetStart: Unit, targetEnd: Double): `-1` | `0` | `1` = js.native
  def compare(target: js.typedarray.Uint8Array, targetStart: Unit, targetEnd: Double, sourceStart: Double): `-1` | `0` | `1` = js.native
  def compare(
    target: js.typedarray.Uint8Array,
    targetStart: Unit,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): `-1` | `0` | `1` = js.native
  def compare(
    target: js.typedarray.Uint8Array,
    targetStart: Unit,
    targetEnd: Double,
    sourceStart: Unit,
    sourceEnd: Double
  ): `-1` | `0` | `1` = js.native
  def compare(target: js.typedarray.Uint8Array, targetStart: Unit, targetEnd: Unit, sourceStart: Double): `-1` | `0` | `1` = js.native
  def compare(
    target: js.typedarray.Uint8Array,
    targetStart: Unit,
    targetEnd: Unit,
    sourceStart: Double,
    sourceEnd: Double
  ): `-1` | `0` | `1` = js.native
  def compare(
    target: js.typedarray.Uint8Array,
    targetStart: Unit,
    targetEnd: Unit,
    sourceStart: Unit,
    sourceEnd: Double
  ): `-1` | `0` | `1` = js.native
  
  /**
    * Copies data from a region of `buf` to a region in `target`, even if the `target`memory region overlaps with `buf`.
    *
    * [`TypedArray.prototype.set()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set) performs the same operation, and is available
    * for all TypedArrays, including Node.js `Buffer`s, although it takes
    * different function arguments.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * // Create two `Buffer` instances.
    * const buf1 = Buffer.allocUnsafe(26);
    * const buf2 = Buffer.allocUnsafe(26).fill('!');
    *
    * for (let i = 0; i < 26; i++) {
    *   // 97 is the decimal ASCII value for 'a'.
    *   buf1[i] = i + 97;
    * }
    *
    * // Copy `buf1` bytes 16 through 19 into `buf2` starting at byte 8 of `buf2`.
    * buf1.copy(buf2, 8, 16, 20);
    * // This is equivalent to:
    * // buf2.set(buf1.subarray(16, 20), 8);
    *
    * console.log(buf2.toString('ascii', 0, 25));
    * // Prints: !!!!!!!!qrst!!!!!!!!!!!!!
    * ```
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * // Create a `Buffer` and copy data from one region to an overlapping region
    * // within the same `Buffer`.
    *
    * const buf = Buffer.allocUnsafe(26);
    *
    * for (let i = 0; i < 26; i++) {
    *   // 97 is the decimal ASCII value for 'a'.
    *   buf[i] = i + 97;
    * }
    *
    * buf.copy(buf, 0, 4, 10);
    *
    * console.log(buf.toString());
    * // Prints: efghijghijklmnopqrstuvwxyz
    * ```
    * @since v0.1.90
    * @param target A `Buffer` or {@link Uint8Array} to copy into.
    * @param [targetStart=0] The offset within `target` at which to begin writing.
    * @param [sourceStart=0] The offset within `buf` from which to begin copying.
    * @param [sourceEnd=buf.length] The offset within `buf` at which to stop copying (not inclusive).
    * @return The number of bytes copied.
    */
  def copy(target: js.typedarray.Uint8Array): Double = js.native
  def copy(target: js.typedarray.Uint8Array, targetStart: Double): Double = js.native
  def copy(target: js.typedarray.Uint8Array, targetStart: Double, sourceStart: Double): Double = js.native
  def copy(target: js.typedarray.Uint8Array, targetStart: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(target: js.typedarray.Uint8Array, targetStart: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
  def copy(target: js.typedarray.Uint8Array, targetStart: Unit, sourceStart: Double): Double = js.native
  def copy(target: js.typedarray.Uint8Array, targetStart: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(target: js.typedarray.Uint8Array, targetStart: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
  
  /**
    * Returns the this object after copying a section of the array identified by start and end
    * to the same array starting at position target
    * @param target If target is negative, it is treated as length+target where length is the
    * length of the array.
    * @param start If start is negative, it is treated as length+start. If end is negative, it
    * is treated as length+end.
    * @param end If not specified, length of the this object is used as its default value.
    */
  /* standard es5 */
  def copyWithin(target: Double, start: Double): this.type = js.native
  def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
  
  /**
    * Returns an array of key, value pairs for every entry in the array
    */
  /* standard es2015.iterable */
  def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
  
  /**
    * Returns `true` if both `buf` and `otherBuffer` have exactly the same bytes,`false` otherwise. Equivalent to `buf.compare(otherBuffer) === 0`.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf1 = Buffer.from('ABC');
    * const buf2 = Buffer.from('414243', 'hex');
    * const buf3 = Buffer.from('ABCD');
    *
    * console.log(buf1.equals(buf2));
    * // Prints: true
    * console.log(buf1.equals(buf3));
    * // Prints: false
    * ```
    * @since v0.11.13
    * @param otherBuffer A `Buffer` or {@link Uint8Array} with which to compare `buf`.
    */
  def equals(otherBuffer: js.typedarray.Uint8Array): Boolean = js.native
  
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param predicate A function that accepts up to three arguments. The every method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  /* standard es5 */
  def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Boolean = js.native
  def every(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any],
    thisArg: Any
  ): Boolean = js.native
  
  /**
    * Fills `buf` with the specified `value`. If the `offset` and `end` are not given,
    * the entire `buf` will be filled:
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * // Fill a `Buffer` with the ASCII character 'h'.
    *
    * const b = Buffer.allocUnsafe(50).fill('h');
    *
    * console.log(b.toString());
    * // Prints: hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
    * ```
    *
    * `value` is coerced to a `uint32` value if it is not a string, `Buffer`, or
    * integer. If the resulting integer is greater than `255` (decimal), `buf` will be
    * filled with `value &#x26; 255`.
    *
    * If the final write of a `fill()` operation falls on a multi-byte character,
    * then only the bytes of that character that fit into `buf` are written:
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * // Fill a `Buffer` with character that takes up two bytes in UTF-8.
    *
    * console.log(Buffer.allocUnsafe(5).fill('\\u0222'));
    * // Prints: <Buffer c8 a2 c8 a2 c8>
    * ```
    *
    * If `value` contains invalid characters, it is truncated; if no valid
    * fill data remains, an exception is thrown:
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(5);
    *
    * console.log(buf.fill('a'));
    * // Prints: <Buffer 61 61 61 61 61>
    * console.log(buf.fill('aazz', 'hex'));
    * // Prints: <Buffer aa aa aa aa aa>
    * console.log(buf.fill('zz', 'hex'));
    * // Throws an exception.
    * ```
    * @since v0.5.0
    * @param value The value with which to fill `buf`.
    * @param [offset=0] Number of bytes to skip before starting to fill `buf`.
    * @param [end=buf.length] Where to stop filling `buf` (not inclusive).
    * @param [encoding='utf8'] The encoding for `value` if `value` is a string.
    * @return A reference to `buf`.
    */
  def fill(value: String): this.type = js.native
  def fill(value: String, offset: Double): this.type = js.native
  def fill(value: String, offset: Double, end: Double): this.type = js.native
  def fill(value: String, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: String, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: String, offset: Unit, end: Double): this.type = js.native
  def fill(value: String, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: String, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: js.typedarray.Uint8Array): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Double): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Double, end: Double): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Unit, end: Double): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: js.typedarray.Uint8Array, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
  
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param predicate A function that accepts up to three arguments. The filter method calls
    * the predicate function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  /* standard es5 */
  def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): js.typedarray.Uint8Array = js.native
  def filter(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any],
    thisArg: Any
  ): js.typedarray.Uint8Array = js.native
  
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  /* standard es5 */
  def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): js.UndefOr[Double] = js.native
  def find(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean],
    thisArg: Any
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
  /* standard es5 */
  def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean],
    thisArg: Any
  ): Double = js.native
  
  /**
    * Performs the specified action for each element in an array.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the
    * callbackfn function one time for each element in the array.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  /* standard es5 */
  def forEach(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /**
    * Equivalent to `buf.indexOf() !== -1`.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from('this is a buffer');
    *
    * console.log(buf.includes('this'));
    * // Prints: true
    * console.log(buf.includes('is'));
    * // Prints: true
    * console.log(buf.includes(Buffer.from('a buffer')));
    * // Prints: true
    * console.log(buf.includes(97));
    * // Prints: true (97 is the decimal ASCII value for 'a')
    * console.log(buf.includes(Buffer.from('a buffer example')));
    * // Prints: false
    * console.log(buf.includes(Buffer.from('a buffer example').slice(0, 8)));
    * // Prints: true
    * console.log(buf.includes('this', 4));
    * // Prints: false
    * ```
    * @since v5.3.0
    * @param value What to search for.
    * @param [byteOffset=0] Where to begin searching in `buf`. If negative, then offset is calculated from the end of `buf`.
    * @param [encoding='utf8'] If `value` is a string, this is its encoding.
    * @return `true` if `value` was found in `buf`, `false` otherwise.
    */
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
  
  /**
    * If `value` is:
    *
    * * a string, `value` is interpreted according to the character encoding in`encoding`.
    * * a `Buffer` or [`Uint8Array`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array), `value` will be used in its entirety.
    * To compare a partial `Buffer`, use `buf.subarray`.
    * * a number, `value` will be interpreted as an unsigned 8-bit integer
    * value between `0` and `255`.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from('this is a buffer');
    *
    * console.log(buf.indexOf('this'));
    * // Prints: 0
    * console.log(buf.indexOf('is'));
    * // Prints: 2
    * console.log(buf.indexOf(Buffer.from('a buffer')));
    * // Prints: 8
    * console.log(buf.indexOf(97));
    * // Prints: 8 (97 is the decimal ASCII value for 'a')
    * console.log(buf.indexOf(Buffer.from('a buffer example')));
    * // Prints: -1
    * console.log(buf.indexOf(Buffer.from('a buffer example').slice(0, 8)));
    * // Prints: 8
    *
    * const utf16Buffer = Buffer.from('\\u039a\\u0391\\u03a3\\u03a3\\u0395', 'utf16le');
    *
    * console.log(utf16Buffer.indexOf('\\u03a3', 0, 'utf16le'));
    * // Prints: 4
    * console.log(utf16Buffer.indexOf('\\u03a3', -4, 'utf16le'));
    * // Prints: 6
    * ```
    *
    * If `value` is not a string, number, or `Buffer`, this method will throw a`TypeError`. If `value` is a number, it will be coerced to a valid byte value,
    * an integer between 0 and 255.
    *
    * If `byteOffset` is not a number, it will be coerced to a number. If the result
    * of coercion is `NaN` or `0`, then the entire buffer will be searched. This
    * behavior matches [`String.prototype.indexOf()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf).
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const b = Buffer.from('abcdef');
    *
    * // Passing a value that's a number, but not a valid byte.
    * // Prints: 2, equivalent to searching for 99 or 'c'.
    * console.log(b.indexOf(99.9));
    * console.log(b.indexOf(256 + 99));
    *
    * // Passing a byteOffset that coerces to NaN or 0.
    * // Prints: 1, searching the whole buffer.
    * console.log(b.indexOf('b', undefined));
    * console.log(b.indexOf('b', {}));
    * console.log(b.indexOf('b', null));
    * console.log(b.indexOf('b', []));
    * ```
    *
    * If `value` is an empty string or empty `Buffer` and `byteOffset` is less
    * than `buf.length`, `byteOffset` will be returned. If `value` is empty and`byteOffset` is at least `buf.length`, `buf.length` will be returned.
    * @since v1.5.0
    * @param value What to search for.
    * @param [byteOffset=0] Where to begin searching in `buf`. If negative, then offset is calculated from the end of `buf`.
    * @param [encoding='utf8'] If `value` is a string, this is the encoding used to determine the binary representation of the string that will be searched for in `buf`.
    * @return The index of the first occurrence of `value` in `buf`, or `-1` if `buf` does not contain `value`.
    */
  def indexOf(value: String): Double = js.native
  def indexOf(value: String, byteOffset: Double): Double = js.native
  def indexOf(value: String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: String, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: js.typedarray.Uint8Array, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Double]] = js.native
  
  /**
    * Adds all the elements of an array separated by the specified separator string.
    * @param separator A string used to separate one element of an array from the next in the
    * resulting String. If omitted, the array elements are separated with a comma.
    */
  /* standard es5 */
  def join(): String = js.native
  def join(separator: String): String = js.native
  
  /**
    * Returns an list of keys in the array
    */
  /* standard es2015.iterable */
  def keys(): IterableIterator[Double] = js.native
  
  /**
    * Identical to `buf.indexOf()`, except the last occurrence of `value` is found
    * rather than the first occurrence.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from('this buffer is a buffer');
    *
    * console.log(buf.lastIndexOf('this'));
    * // Prints: 0
    * console.log(buf.lastIndexOf('buffer'));
    * // Prints: 17
    * console.log(buf.lastIndexOf(Buffer.from('buffer')));
    * // Prints: 17
    * console.log(buf.lastIndexOf(97));
    * // Prints: 15 (97 is the decimal ASCII value for 'a')
    * console.log(buf.lastIndexOf(Buffer.from('yolo')));
    * // Prints: -1
    * console.log(buf.lastIndexOf('buffer', 5));
    * // Prints: 5
    * console.log(buf.lastIndexOf('buffer', 4));
    * // Prints: -1
    *
    * const utf16Buffer = Buffer.from('\\u039a\\u0391\\u03a3\\u03a3\\u0395', 'utf16le');
    *
    * console.log(utf16Buffer.lastIndexOf('\\u03a3', undefined, 'utf16le'));
    * // Prints: 6
    * console.log(utf16Buffer.lastIndexOf('\\u03a3', -5, 'utf16le'));
    * // Prints: 4
    * ```
    *
    * If `value` is not a string, number, or `Buffer`, this method will throw a`TypeError`. If `value` is a number, it will be coerced to a valid byte value,
    * an integer between 0 and 255.
    *
    * If `byteOffset` is not a number, it will be coerced to a number. Any arguments
    * that coerce to `NaN`, like `{}` or `undefined`, will search the whole buffer.
    * This behavior matches [`String.prototype.lastIndexOf()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/lastIndexOf).
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const b = Buffer.from('abcdef');
    *
    * // Passing a value that's a number, but not a valid byte.
    * // Prints: 2, equivalent to searching for 99 or 'c'.
    * console.log(b.lastIndexOf(99.9));
    * console.log(b.lastIndexOf(256 + 99));
    *
    * // Passing a byteOffset that coerces to NaN.
    * // Prints: 1, searching the whole buffer.
    * console.log(b.lastIndexOf('b', undefined));
    * console.log(b.lastIndexOf('b', {}));
    *
    * // Passing a byteOffset that coerces to 0.
    * // Prints: -1, equivalent to passing 0.
    * console.log(b.lastIndexOf('b', null));
    * console.log(b.lastIndexOf('b', []));
    * ```
    *
    * If `value` is an empty string or empty `Buffer`, `byteOffset` will be returned.
    * @since v6.0.0
    * @param value What to search for.
    * @param [byteOffset=buf.length - 1] Where to begin searching in `buf`. If negative, then offset is calculated from the end of `buf`.
    * @param [encoding='utf8'] If `value` is a string, this is the encoding used to determine the binary representation of the string that will be searched for in `buf`.
    * @return The index of the last occurrence of `value` in `buf`, or `-1` if `buf` does not contain `value`.
    */
  def lastIndexOf(value: String): Double = js.native
  def lastIndexOf(value: String, byteOffset: Double): Double = js.native
  def lastIndexOf(value: String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: String, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: js.typedarray.Uint8Array): Double = js.native
  def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
  def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
  
  /**
    * The length of the array.
    */
  /* standard es5 */
  val length: Double = js.native
  
  /**
    * Calls a defined callback function on each element of an array, and returns an array that
    * contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the
    * callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  /* standard es5 */
  def map(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double]): js.typedarray.Uint8Array = js.native
  def map(
    callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double],
    thisArg: Any
  ): js.typedarray.Uint8Array = js.native
  
  /**
    * Reads a signed, big-endian 64-bit integer from `buf` at the specified `offset`.
    *
    * Integers read from a `Buffer` are interpreted as two's complement signed
    * values.
    * @since v12.0.0, v10.20.0
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy: `0 <= offset <= buf.length - 8`.
    */
  def readBigInt64BE(): js.BigInt = js.native
  def readBigInt64BE(offset: Double): js.BigInt = js.native
  
  /**
    * Reads a signed, little-endian 64-bit integer from `buf` at the specified`offset`.
    *
    * Integers read from a `Buffer` are interpreted as two's complement signed
    * values.
    * @since v12.0.0, v10.20.0
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy: `0 <= offset <= buf.length - 8`.
    */
  def readBigInt64LE(): js.BigInt = js.native
  def readBigInt64LE(offset: Double): js.BigInt = js.native
  
  /**
    * Reads an unsigned, big-endian 64-bit integer from `buf` at the specified`offset`.
    *
    * This function is also available under the `readBigUint64BE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x00, 0x00, 0x00, 0x00, 0xff, 0xff, 0xff, 0xff]);
    *
    * console.log(buf.readBigUInt64BE(0));
    * // Prints: 4294967295n
    * ```
    * @since v12.0.0, v10.20.0
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy: `0 <= offset <= buf.length - 8`.
    */
  def readBigUInt64BE(): js.BigInt = js.native
  def readBigUInt64BE(offset: Double): js.BigInt = js.native
  
  /**
    * Reads an unsigned, little-endian 64-bit integer from `buf` at the specified`offset`.
    *
    * This function is also available under the `readBigUint64LE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x00, 0x00, 0x00, 0x00, 0xff, 0xff, 0xff, 0xff]);
    *
    * console.log(buf.readBigUInt64LE(0));
    * // Prints: 18446744069414584320n
    * ```
    * @since v12.0.0, v10.20.0
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy: `0 <= offset <= buf.length - 8`.
    */
  def readBigUInt64LE(): js.BigInt = js.native
  def readBigUInt64LE(offset: Double): js.BigInt = js.native
  
  /**
    * @alias Buffer.readBigUInt64BE
    * @since v14.10.0, v12.19.0
    */
  def readBigUint64BE(): js.BigInt = js.native
  def readBigUint64BE(offset: Double): js.BigInt = js.native
  
  /**
    * @alias Buffer.readBigUInt64LE
    * @since v14.10.0, v12.19.0
    */
  def readBigUint64LE(): js.BigInt = js.native
  def readBigUint64LE(offset: Double): js.BigInt = js.native
  
  /**
    * Reads a 64-bit, big-endian double from `buf` at the specified `offset`.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([1, 2, 3, 4, 5, 6, 7, 8]);
    *
    * console.log(buf.readDoubleBE(0));
    * // Prints: 8.20788039913184e-304
    * ```
    * @since v0.11.15
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 8`.
    */
  def readDoubleBE(): Double = js.native
  def readDoubleBE(offset: Double): Double = js.native
  
  /**
    * Reads a 64-bit, little-endian double from `buf` at the specified `offset`.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([1, 2, 3, 4, 5, 6, 7, 8]);
    *
    * console.log(buf.readDoubleLE(0));
    * // Prints: 5.447603722011605e-270
    * console.log(buf.readDoubleLE(1));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.11.15
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 8`.
    */
  def readDoubleLE(): Double = js.native
  def readDoubleLE(offset: Double): Double = js.native
  
  /**
    * Reads a 32-bit, big-endian float from `buf` at the specified `offset`.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([1, 2, 3, 4]);
    *
    * console.log(buf.readFloatBE(0));
    * // Prints: 2.387939260590663e-38
    * ```
    * @since v0.11.15
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
    */
  def readFloatBE(): Double = js.native
  def readFloatBE(offset: Double): Double = js.native
  
  /**
    * Reads a 32-bit, little-endian float from `buf` at the specified `offset`.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([1, 2, 3, 4]);
    *
    * console.log(buf.readFloatLE(0));
    * // Prints: 1.539989614439558e-36
    * console.log(buf.readFloatLE(1));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.11.15
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
    */
  def readFloatLE(): Double = js.native
  def readFloatLE(offset: Double): Double = js.native
  
  /**
    * Reads a signed, big-endian 16-bit integer from `buf` at the specified `offset`.
    *
    * Integers read from a `Buffer` are interpreted as two's complement signed values.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0, 5]);
    *
    * console.log(buf.readInt16BE(0));
    * // Prints: 5
    * ```
    * @since v0.5.5
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 2`.
    */
  def readInt16BE(): Double = js.native
  def readInt16BE(offset: Double): Double = js.native
  
  /**
    * Reads a signed, little-endian 16-bit integer from `buf` at the specified`offset`.
    *
    * Integers read from a `Buffer` are interpreted as two's complement signed values.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0, 5]);
    *
    * console.log(buf.readInt16LE(0));
    * // Prints: 1280
    * console.log(buf.readInt16LE(1));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.5.5
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 2`.
    */
  def readInt16LE(): Double = js.native
  def readInt16LE(offset: Double): Double = js.native
  
  /**
    * Reads a signed, big-endian 32-bit integer from `buf` at the specified `offset`.
    *
    * Integers read from a `Buffer` are interpreted as two's complement signed values.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0, 0, 0, 5]);
    *
    * console.log(buf.readInt32BE(0));
    * // Prints: 5
    * ```
    * @since v0.5.5
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
    */
  def readInt32BE(): Double = js.native
  def readInt32BE(offset: Double): Double = js.native
  
  /**
    * Reads a signed, little-endian 32-bit integer from `buf` at the specified`offset`.
    *
    * Integers read from a `Buffer` are interpreted as two's complement signed values.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0, 0, 0, 5]);
    *
    * console.log(buf.readInt32LE(0));
    * // Prints: 83886080
    * console.log(buf.readInt32LE(1));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.5.5
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
    */
  def readInt32LE(): Double = js.native
  def readInt32LE(offset: Double): Double = js.native
  
  /**
    * Reads a signed 8-bit integer from `buf` at the specified `offset`.
    *
    * Integers read from a `Buffer` are interpreted as two's complement signed values.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([-1, 5]);
    *
    * console.log(buf.readInt8(0));
    * // Prints: -1
    * console.log(buf.readInt8(1));
    * // Prints: 5
    * console.log(buf.readInt8(2));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.5.0
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 1`.
    */
  def readInt8(): Double = js.native
  def readInt8(offset: Double): Double = js.native
  
  /**
    * Reads `byteLength` number of bytes from `buf` at the specified `offset`and interprets the result as a big-endian, two's complement signed value
    * supporting up to 48 bits of accuracy.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78, 0x90, 0xab]);
    *
    * console.log(buf.readIntBE(0, 6).toString(16));
    * // Prints: 1234567890ab
    * console.log(buf.readIntBE(1, 6).toString(16));
    * // Throws ERR_OUT_OF_RANGE.
    * console.log(buf.readIntBE(1, 0).toString(16));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.11.15
    * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - byteLength`.
    * @param byteLength Number of bytes to read. Must satisfy `0 < byteLength <= 6`.
    */
  def readIntBE(offset: Double, byteLength: Double): Double = js.native
  
  /**
    * Reads `byteLength` number of bytes from `buf` at the specified `offset`and interprets the result as a little-endian, two's complement signed value
    * supporting up to 48 bits of accuracy.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78, 0x90, 0xab]);
    *
    * console.log(buf.readIntLE(0, 6).toString(16));
    * // Prints: -546f87a9cbee
    * ```
    * @since v0.11.15
    * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - byteLength`.
    * @param byteLength Number of bytes to read. Must satisfy `0 < byteLength <= 6`.
    */
  def readIntLE(offset: Double, byteLength: Double): Double = js.native
  
  /**
    * Reads an unsigned, big-endian 16-bit integer from `buf` at the specified`offset`.
    *
    * This function is also available under the `readUint16BE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x12, 0x34, 0x56]);
    *
    * console.log(buf.readUInt16BE(0).toString(16));
    * // Prints: 1234
    * console.log(buf.readUInt16BE(1).toString(16));
    * // Prints: 3456
    * ```
    * @since v0.5.5
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 2`.
    */
  def readUInt16BE(): Double = js.native
  def readUInt16BE(offset: Double): Double = js.native
  
  /**
    * Reads an unsigned, little-endian 16-bit integer from `buf` at the specified`offset`.
    *
    * This function is also available under the `readUint16LE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x12, 0x34, 0x56]);
    *
    * console.log(buf.readUInt16LE(0).toString(16));
    * // Prints: 3412
    * console.log(buf.readUInt16LE(1).toString(16));
    * // Prints: 5634
    * console.log(buf.readUInt16LE(2).toString(16));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.5.5
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 2`.
    */
  def readUInt16LE(): Double = js.native
  def readUInt16LE(offset: Double): Double = js.native
  
  /**
    * Reads an unsigned, big-endian 32-bit integer from `buf` at the specified`offset`.
    *
    * This function is also available under the `readUint32BE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78]);
    *
    * console.log(buf.readUInt32BE(0).toString(16));
    * // Prints: 12345678
    * ```
    * @since v0.5.5
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
    */
  def readUInt32BE(): Double = js.native
  def readUInt32BE(offset: Double): Double = js.native
  
  /**
    * Reads an unsigned, little-endian 32-bit integer from `buf` at the specified`offset`.
    *
    * This function is also available under the `readUint32LE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78]);
    *
    * console.log(buf.readUInt32LE(0).toString(16));
    * // Prints: 78563412
    * console.log(buf.readUInt32LE(1).toString(16));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.5.5
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
    */
  def readUInt32LE(): Double = js.native
  def readUInt32LE(offset: Double): Double = js.native
  
  /**
    * Reads an unsigned 8-bit integer from `buf` at the specified `offset`.
    *
    * This function is also available under the `readUint8` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([1, -2]);
    *
    * console.log(buf.readUInt8(0));
    * // Prints: 1
    * console.log(buf.readUInt8(1));
    * // Prints: 254
    * console.log(buf.readUInt8(2));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.5.0
    * @param [offset=0] Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 1`.
    */
  def readUInt8(): Double = js.native
  def readUInt8(offset: Double): Double = js.native
  
  /**
    * Reads `byteLength` number of bytes from `buf` at the specified `offset`and interprets the result as an unsigned big-endian integer supporting
    * up to 48 bits of accuracy.
    *
    * This function is also available under the `readUintBE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78, 0x90, 0xab]);
    *
    * console.log(buf.readUIntBE(0, 6).toString(16));
    * // Prints: 1234567890ab
    * console.log(buf.readUIntBE(1, 6).toString(16));
    * // Throws ERR_OUT_OF_RANGE.
    * ```
    * @since v0.11.15
    * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - byteLength`.
    * @param byteLength Number of bytes to read. Must satisfy `0 < byteLength <= 6`.
    */
  def readUIntBE(offset: Double, byteLength: Double): Double = js.native
  
  /**
    * Reads `byteLength` number of bytes from `buf` at the specified `offset`and interprets the result as an unsigned, little-endian integer supporting
    * up to 48 bits of accuracy.
    *
    * This function is also available under the `readUintLE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78, 0x90, 0xab]);
    *
    * console.log(buf.readUIntLE(0, 6).toString(16));
    * // Prints: ab9078563412
    * ```
    * @since v0.11.15
    * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - byteLength`.
    * @param byteLength Number of bytes to read. Must satisfy `0 < byteLength <= 6`.
    */
  def readUIntLE(offset: Double, byteLength: Double): Double = js.native
  
  /**
    * @alias Buffer.readUInt16BE
    * @since v14.9.0, v12.19.0
    */
  def readUint16BE(): Double = js.native
  def readUint16BE(offset: Double): Double = js.native
  
  /**
    * @alias Buffer.readUInt16LE
    * @since v14.9.0, v12.19.0
    */
  def readUint16LE(): Double = js.native
  def readUint16LE(offset: Double): Double = js.native
  
  /**
    * @alias Buffer.readUInt32BE
    * @since v14.9.0, v12.19.0
    */
  def readUint32BE(): Double = js.native
  def readUint32BE(offset: Double): Double = js.native
  
  /**
    * @alias Buffer.readUInt32LE
    * @since v14.9.0, v12.19.0
    */
  def readUint32LE(): Double = js.native
  def readUint32LE(offset: Double): Double = js.native
  
  /**
    * @alias Buffer.readUInt8
    * @since v14.9.0, v12.19.0
    */
  def readUint8(): Double = js.native
  def readUint8(offset: Double): Double = js.native
  
  /**
    * @alias Buffer.readUIntBE
    * @since v14.9.0, v12.19.0
    */
  def readUintBE(offset: Double, byteLength: Double): Double = js.native
  
  /**
    * @alias Buffer.readUIntLE
    * @since v14.9.0, v12.19.0
    */
  def readUintLE(offset: Double, byteLength: Double): Double = js.native
  
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
  /* standard es5 */
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ]
  ): Double = js.native
  /* standard es5 */
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
  /* standard es5 */
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
  /* standard es5 */
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ]
  ): Double = js.native
  /* standard es5 */
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
  /* standard es5 */
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
  /* standard es5 */
  def reverse(): js.typedarray.Uint8Array = js.native
  
  /**
    * Sets a value or an array of values.
    * @param array A typed or untyped array of values to set.
    * @param offset The index in the current array at which the values are to be written.
    */
  /* standard es5 */
  def set(array: ArrayLike[Double]): Unit = js.native
  def set(array: ArrayLike[Double], offset: Double): Unit = js.native
  
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
    */
  /* standard es5 */
  def slice(): js.typedarray.Uint8Array = js.native
  def slice(start: Double): js.typedarray.Uint8Array = js.native
  def slice(start: Double, end: Double): js.typedarray.Uint8Array = js.native
  def slice(start: Unit, end: Double): js.typedarray.Uint8Array = js.native
  
  /**
    * Determines whether the specified callback function returns true for any element of an array.
    * @param predicate A function that accepts up to three arguments. The some method calls
    * the predicate function for each element in the array until the predicate returns a value
    * which is coercible to the Boolean value true, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the predicate function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  /* standard es5 */
  def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Boolean = js.native
  def some(
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any],
    thisArg: Any
  ): Boolean = js.native
  
  /**
    * Sorts an array.
    * @param compareFn Function used to determine the order of the elements. It is expected to return
    * a negative value if first argument is less than second argument, zero if they're equal and a positive
    * value otherwise. If omitted, the elements are sorted in ascending order.
    * ```ts
    * [11,2,22,1].sort((a, b) => a - b)
    * ```
    */
  /* standard es5 */
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
  
  /**
    * Gets a new Uint8Array view of the ArrayBuffer store for this array, referencing the elements
    * at begin, inclusive, up to end, exclusive.
    * @param begin The index of the beginning of the array.
    * @param end The index of the end of the array.
    */
  /* standard es5 */
  def subarray(): js.typedarray.Uint8Array = js.native
  def subarray(begin: Double): js.typedarray.Uint8Array = js.native
  def subarray(begin: Double, end: Double): js.typedarray.Uint8Array = js.native
  def subarray(begin: Unit, end: Double): js.typedarray.Uint8Array = js.native
  
  /**
    * Interprets `buf` as an array of unsigned 16-bit integers and swaps the
    * byte order _in-place_. Throws `ERR_INVALID_BUFFER_SIZE` if `buf.length` is not a multiple of 2.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf1 = Buffer.from([0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8]);
    *
    * console.log(buf1);
    * // Prints: <Buffer 01 02 03 04 05 06 07 08>
    *
    * buf1.swap16();
    *
    * console.log(buf1);
    * // Prints: <Buffer 02 01 04 03 06 05 08 07>
    *
    * const buf2 = Buffer.from([0x1, 0x2, 0x3]);
    *
    * buf2.swap16();
    * // Throws ERR_INVALID_BUFFER_SIZE.
    * ```
    *
    * One convenient use of `buf.swap16()` is to perform a fast in-place conversion
    * between UTF-16 little-endian and UTF-16 big-endian:
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from('This is little-endian UTF-16', 'utf16le');
    * buf.swap16(); // Convert to big-endian UTF-16 text.
    * ```
    * @since v5.10.0
    * @return A reference to `buf`.
    */
  def swap16(): Buffer = js.native
  
  /**
    * Interprets `buf` as an array of unsigned 32-bit integers and swaps the
    * byte order _in-place_. Throws `ERR_INVALID_BUFFER_SIZE` if `buf.length` is not a multiple of 4.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf1 = Buffer.from([0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8]);
    *
    * console.log(buf1);
    * // Prints: <Buffer 01 02 03 04 05 06 07 08>
    *
    * buf1.swap32();
    *
    * console.log(buf1);
    * // Prints: <Buffer 04 03 02 01 08 07 06 05>
    *
    * const buf2 = Buffer.from([0x1, 0x2, 0x3]);
    *
    * buf2.swap32();
    * // Throws ERR_INVALID_BUFFER_SIZE.
    * ```
    * @since v5.10.0
    * @return A reference to `buf`.
    */
  def swap32(): Buffer = js.native
  
  /**
    * Interprets `buf` as an array of 64-bit numbers and swaps byte order _in-place_.
    * Throws `ERR_INVALID_BUFFER_SIZE` if `buf.length` is not a multiple of 8.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf1 = Buffer.from([0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8]);
    *
    * console.log(buf1);
    * // Prints: <Buffer 01 02 03 04 05 06 07 08>
    *
    * buf1.swap64();
    *
    * console.log(buf1);
    * // Prints: <Buffer 08 07 06 05 04 03 02 01>
    *
    * const buf2 = Buffer.from([0x1, 0x2, 0x3]);
    *
    * buf2.swap64();
    * // Throws ERR_INVALID_BUFFER_SIZE.
    * ```
    * @since v6.3.0
    * @return A reference to `buf`.
    */
  def swap64(): Buffer = js.native
  
  /**
    * Returns a JSON representation of `buf`. [`JSON.stringify()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify) implicitly calls
    * this function when stringifying a `Buffer` instance.
    *
    * `Buffer.from()` accepts objects in the format returned from this method.
    * In particular, `Buffer.from(buf.toJSON())` works like `Buffer.from(buf)`.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.from([0x1, 0x2, 0x3, 0x4, 0x5]);
    * const json = JSON.stringify(buf);
    *
    * console.log(json);
    * // Prints: {"type":"Buffer","data":[1,2,3,4,5]}
    *
    * const copy = JSON.parse(json, (key, value) => {
    *   return value &#x26;&#x26; value.type === 'Buffer' ?
    *     Buffer.from(value) :
    *     value;
    * });
    *
    * console.log(copy);
    * // Prints: <Buffer 01 02 03 04 05>
    * ```
    * @since v0.9.2
    */
  def toJSON(): Data = js.native
  
  def toString(encoding: Unit, start: Double): String = js.native
  def toString(encoding: Unit, start: Double, end: Double): String = js.native
  def toString(encoding: Unit, start: Unit, end: Double): String = js.native
  def toString(encoding: BufferEncoding): String = js.native
  def toString(encoding: BufferEncoding, start: Double): String = js.native
  def toString(encoding: BufferEncoding, start: Double, end: Double): String = js.native
  def toString(encoding: BufferEncoding, start: Unit, end: Double): String = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: Uint8Array = js.native
  
  /**
    * Returns an list of values in the array
    */
  /* standard es2015.iterable */
  def values(): IterableIterator[Double] = js.native
  
  /**
    * Writes `string` to `buf` at `offset` according to the character encoding in`encoding`. The `length` parameter is the number of bytes to write. If `buf` did
    * not contain enough space to fit the entire string, only part of `string` will be
    * written. However, partially encoded characters will not be written.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.alloc(256);
    *
    * const len = buf.write('\\u00bd + \\u00bc = \\u00be', 0);
    *
    * console.log(`${len} bytes: ${buf.toString('utf8', 0, len)}`);
    * // Prints: 12 bytes: ½ + ¼ = ¾
    *
    * const buffer = Buffer.alloc(10);
    *
    * const length = buffer.write('abcd', 8);
    *
    * console.log(`${length} bytes: ${buffer.toString('utf8', 8, 10)}`);
    * // Prints: 2 bytes : ab
    * ```
    * @since v0.1.90
    * @param string String to write to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write `string`.
    * @param [length=buf.length - offset] Maximum number of bytes to write (written bytes will not exceed `buf.length - offset`).
    * @param [encoding='utf8'] The character encoding of `string`.
    * @return Number of bytes written.
    */
  def write(string: String): Double = js.native
  def write(string: String, encoding: BufferEncoding): Double = js.native
  def write(string: String, offset: Double): Double = js.native
  def write(string: String, offset: Double, encoding: BufferEncoding): Double = js.native
  def write(string: String, offset: Double, length: Double): Double = js.native
  def write(string: String, offset: Double, length: Double, encoding: BufferEncoding): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as big-endian.
    *
    * `value` is interpreted and written as a two's complement signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(8);
    *
    * buf.writeBigInt64BE(0x0102030405060708n, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 01 02 03 04 05 06 07 08>
    * ```
    * @since v12.0.0, v10.20.0
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy: `0 <= offset <= buf.length - 8`.
    * @return `offset` plus the number of bytes written.
    */
  def writeBigInt64BE(value: js.BigInt): Double = js.native
  def writeBigInt64BE(value: js.BigInt, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as little-endian.
    *
    * `value` is interpreted and written as a two's complement signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(8);
    *
    * buf.writeBigInt64LE(0x0102030405060708n, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 08 07 06 05 04 03 02 01>
    * ```
    * @since v12.0.0, v10.20.0
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy: `0 <= offset <= buf.length - 8`.
    * @return `offset` plus the number of bytes written.
    */
  def writeBigInt64LE(value: js.BigInt): Double = js.native
  def writeBigInt64LE(value: js.BigInt, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as big-endian.
    *
    * This function is also available under the `writeBigUint64BE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(8);
    *
    * buf.writeBigUInt64BE(0xdecafafecacefaden, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer de ca fa fe ca ce fa de>
    * ```
    * @since v12.0.0, v10.20.0
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy: `0 <= offset <= buf.length - 8`.
    * @return `offset` plus the number of bytes written.
    */
  def writeBigUInt64BE(value: js.BigInt): Double = js.native
  def writeBigUInt64BE(value: js.BigInt, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as little-endian
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(8);
    *
    * buf.writeBigUInt64LE(0xdecafafecacefaden, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer de fa ce ca fe fa ca de>
    * ```
    *
    * This function is also available under the `writeBigUint64LE` alias.
    * @since v12.0.0, v10.20.0
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy: `0 <= offset <= buf.length - 8`.
    * @return `offset` plus the number of bytes written.
    */
  def writeBigUInt64LE(value: js.BigInt): Double = js.native
  def writeBigUInt64LE(value: js.BigInt, offset: Double): Double = js.native
  
  /**
    * @alias Buffer.writeBigUInt64BE
    * @since v14.10.0, v12.19.0
    */
  def writeBigUint64BE(value: js.BigInt): Double = js.native
  def writeBigUint64BE(value: js.BigInt, offset: Double): Double = js.native
  
  /**
    * @alias Buffer.writeBigUInt64LE
    * @since v14.10.0, v12.19.0
    */
  def writeBigUint64LE(value: js.BigInt): Double = js.native
  def writeBigUint64LE(value: js.BigInt, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as big-endian. The `value`must be a JavaScript number. Behavior is undefined when `value` is anything
    * other than a JavaScript number.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(8);
    *
    * buf.writeDoubleBE(123.456, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 40 5e dd 2f 1a 9f be 77>
    * ```
    * @since v0.11.15
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 8`.
    * @return `offset` plus the number of bytes written.
    */
  def writeDoubleBE(value: Double): Double = js.native
  def writeDoubleBE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as little-endian. The `value`must be a JavaScript number. Behavior is undefined when `value` is anything
    * other than a JavaScript number.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(8);
    *
    * buf.writeDoubleLE(123.456, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 77 be 9f 1a 2f dd 5e 40>
    * ```
    * @since v0.11.15
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 8`.
    * @return `offset` plus the number of bytes written.
    */
  def writeDoubleLE(value: Double): Double = js.native
  def writeDoubleLE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as big-endian. Behavior is
    * undefined when `value` is anything other than a JavaScript number.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeFloatBE(0xcafebabe, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 4f 4a fe bb>
    * ```
    * @since v0.11.15
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
    * @return `offset` plus the number of bytes written.
    */
  def writeFloatBE(value: Double): Double = js.native
  def writeFloatBE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as little-endian. Behavior is
    * undefined when `value` is anything other than a JavaScript number.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeFloatLE(0xcafebabe, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer bb fe 4a 4f>
    * ```
    * @since v0.11.15
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
    * @return `offset` plus the number of bytes written.
    */
  def writeFloatLE(value: Double): Double = js.native
  def writeFloatLE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as big-endian.  The `value`must be a valid signed 16-bit integer. Behavior is undefined when `value` is
    * anything other than a signed 16-bit integer.
    *
    * The `value` is interpreted and written as a two's complement signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(2);
    *
    * buf.writeInt16BE(0x0102, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 01 02>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 2`.
    * @return `offset` plus the number of bytes written.
    */
  def writeInt16BE(value: Double): Double = js.native
  def writeInt16BE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as little-endian.  The `value`must be a valid signed 16-bit integer. Behavior is undefined when `value` is
    * anything other than a signed 16-bit integer.
    *
    * The `value` is interpreted and written as a two's complement signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(2);
    *
    * buf.writeInt16LE(0x0304, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 04 03>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 2`.
    * @return `offset` plus the number of bytes written.
    */
  def writeInt16LE(value: Double): Double = js.native
  def writeInt16LE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as big-endian. The `value`must be a valid signed 32-bit integer. Behavior is undefined when `value` is
    * anything other than a signed 32-bit integer.
    *
    * The `value` is interpreted and written as a two's complement signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeInt32BE(0x01020304, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 01 02 03 04>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
    * @return `offset` plus the number of bytes written.
    */
  def writeInt32BE(value: Double): Double = js.native
  def writeInt32BE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as little-endian. The `value`must be a valid signed 32-bit integer. Behavior is undefined when `value` is
    * anything other than a signed 32-bit integer.
    *
    * The `value` is interpreted and written as a two's complement signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeInt32LE(0x05060708, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer 08 07 06 05>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
    * @return `offset` plus the number of bytes written.
    */
  def writeInt32LE(value: Double): Double = js.native
  def writeInt32LE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset`. `value` must be a valid
    * signed 8-bit integer. Behavior is undefined when `value` is anything other than
    * a signed 8-bit integer.
    *
    * `value` is interpreted and written as a two's complement signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(2);
    *
    * buf.writeInt8(2, 0);
    * buf.writeInt8(-2, 1);
    *
    * console.log(buf);
    * // Prints: <Buffer 02 fe>
    * ```
    * @since v0.5.0
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 1`.
    * @return `offset` plus the number of bytes written.
    */
  def writeInt8(value: Double): Double = js.native
  def writeInt8(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `byteLength` bytes of `value` to `buf` at the specified `offset`as big-endian. Supports up to 48 bits of accuracy. Behavior is undefined when`value` is anything other than a
    * signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(6);
    *
    * buf.writeIntBE(0x1234567890ab, 0, 6);
    *
    * console.log(buf);
    * // Prints: <Buffer 12 34 56 78 90 ab>
    * ```
    * @since v0.11.15
    * @param value Number to be written to `buf`.
    * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - byteLength`.
    * @param byteLength Number of bytes to write. Must satisfy `0 < byteLength <= 6`.
    * @return `offset` plus the number of bytes written.
    */
  def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  /**
    * Writes `byteLength` bytes of `value` to `buf` at the specified `offset`as little-endian. Supports up to 48 bits of accuracy. Behavior is undefined
    * when `value` is anything other than a signed integer.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(6);
    *
    * buf.writeIntLE(0x1234567890ab, 0, 6);
    *
    * console.log(buf);
    * // Prints: <Buffer ab 90 78 56 34 12>
    * ```
    * @since v0.11.15
    * @param value Number to be written to `buf`.
    * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - byteLength`.
    * @param byteLength Number of bytes to write. Must satisfy `0 < byteLength <= 6`.
    * @return `offset` plus the number of bytes written.
    */
  def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as big-endian. The `value`must be a valid unsigned 16-bit integer. Behavior is undefined when `value`is anything other than an
    * unsigned 16-bit integer.
    *
    * This function is also available under the `writeUint16BE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeUInt16BE(0xdead, 0);
    * buf.writeUInt16BE(0xbeef, 2);
    *
    * console.log(buf);
    * // Prints: <Buffer de ad be ef>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 2`.
    * @return `offset` plus the number of bytes written.
    */
  def writeUInt16BE(value: Double): Double = js.native
  def writeUInt16BE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as little-endian. The `value`must be a valid unsigned 16-bit integer. Behavior is undefined when `value` is
    * anything other than an unsigned 16-bit integer.
    *
    * This function is also available under the `writeUint16LE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeUInt16LE(0xdead, 0);
    * buf.writeUInt16LE(0xbeef, 2);
    *
    * console.log(buf);
    * // Prints: <Buffer ad de ef be>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 2`.
    * @return `offset` plus the number of bytes written.
    */
  def writeUInt16LE(value: Double): Double = js.native
  def writeUInt16LE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as big-endian. The `value`must be a valid unsigned 32-bit integer. Behavior is undefined when `value`is anything other than an
    * unsigned 32-bit integer.
    *
    * This function is also available under the `writeUint32BE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeUInt32BE(0xfeedface, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer fe ed fa ce>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
    * @return `offset` plus the number of bytes written.
    */
  def writeUInt32BE(value: Double): Double = js.native
  def writeUInt32BE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset` as little-endian. The `value`must be a valid unsigned 32-bit integer. Behavior is undefined when `value` is
    * anything other than an unsigned 32-bit integer.
    *
    * This function is also available under the `writeUint32LE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeUInt32LE(0xfeedface, 0);
    *
    * console.log(buf);
    * // Prints: <Buffer ce fa ed fe>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
    * @return `offset` plus the number of bytes written.
    */
  def writeUInt32LE(value: Double): Double = js.native
  def writeUInt32LE(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `value` to `buf` at the specified `offset`. `value` must be a
    * valid unsigned 8-bit integer. Behavior is undefined when `value` is anything
    * other than an unsigned 8-bit integer.
    *
    * This function is also available under the `writeUint8` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(4);
    *
    * buf.writeUInt8(0x3, 0);
    * buf.writeUInt8(0x4, 1);
    * buf.writeUInt8(0x23, 2);
    * buf.writeUInt8(0x42, 3);
    *
    * console.log(buf);
    * // Prints: <Buffer 03 04 23 42>
    * ```
    * @since v0.5.0
    * @param value Number to be written to `buf`.
    * @param [offset=0] Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 1`.
    * @return `offset` plus the number of bytes written.
    */
  def writeUInt8(value: Double): Double = js.native
  def writeUInt8(value: Double, offset: Double): Double = js.native
  
  /**
    * Writes `byteLength` bytes of `value` to `buf` at the specified `offset`as big-endian. Supports up to 48 bits of accuracy. Behavior is undefined
    * when `value` is anything other than an unsigned integer.
    *
    * This function is also available under the `writeUintBE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(6);
    *
    * buf.writeUIntBE(0x1234567890ab, 0, 6);
    *
    * console.log(buf);
    * // Prints: <Buffer 12 34 56 78 90 ab>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - byteLength`.
    * @param byteLength Number of bytes to write. Must satisfy `0 < byteLength <= 6`.
    * @return `offset` plus the number of bytes written.
    */
  def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  /**
    * Writes `byteLength` bytes of `value` to `buf` at the specified `offset`as little-endian. Supports up to 48 bits of accuracy. Behavior is undefined
    * when `value` is anything other than an unsigned integer.
    *
    * This function is also available under the `writeUintLE` alias.
    *
    * ```js
    * import { Buffer } from 'buffer';
    *
    * const buf = Buffer.allocUnsafe(6);
    *
    * buf.writeUIntLE(0x1234567890ab, 0, 6);
    *
    * console.log(buf);
    * // Prints: <Buffer ab 90 78 56 34 12>
    * ```
    * @since v0.5.5
    * @param value Number to be written to `buf`.
    * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - byteLength`.
    * @param byteLength Number of bytes to write. Must satisfy `0 < byteLength <= 6`.
    * @return `offset` plus the number of bytes written.
    */
  def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  /**
    * @alias Buffer.writeUInt16BE
    * @since v14.9.0, v12.19.0
    */
  def writeUint16BE(value: Double): Double = js.native
  def writeUint16BE(value: Double, offset: Double): Double = js.native
  
  /**
    * @alias Buffer.writeUInt16LE
    * @since v14.9.0, v12.19.0
    */
  def writeUint16LE(value: Double): Double = js.native
  def writeUint16LE(value: Double, offset: Double): Double = js.native
  
  /**
    * @alias Buffer.writeUInt32BE
    * @since v14.9.0, v12.19.0
    */
  def writeUint32BE(value: Double): Double = js.native
  def writeUint32BE(value: Double, offset: Double): Double = js.native
  
  /**
    * @alias Buffer.writeUInt32LE
    * @since v14.9.0, v12.19.0
    */
  def writeUint32LE(value: Double): Double = js.native
  def writeUint32LE(value: Double, offset: Double): Double = js.native
  
  /**
    * @alias Buffer.writeUInt8
    * @since v14.9.0, v12.19.0
    */
  def writeUint8(value: Double): Double = js.native
  def writeUint8(value: Double, offset: Double): Double = js.native
  
  /**
    * @alias Buffer.writeUIntBE
    * @since v14.9.0, v12.19.0
    */
  def writeUintBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  
  /**
    * @alias Buffer.writeUIntLE
    * @since v14.9.0, v12.19.0
    */
  def writeUintLE(value: Double, offset: Double, byteLength: Double): Double = js.native
}
