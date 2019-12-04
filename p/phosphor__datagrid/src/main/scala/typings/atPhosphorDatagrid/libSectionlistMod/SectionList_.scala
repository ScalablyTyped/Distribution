package typings.atPhosphorDatagrid.libSectionlistMod

import typings.atPhosphorDatagrid.libSectionlistMod.SectionList.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/sectionlist", "SectionList")
@js.native
class SectionList_ protected () extends js.Object {
  /**
    * Construct a new section list.
    *
    * @param options - The options for initializing the list.
    */
  def this(options: IOptions) = this()
  var _baseSize: js.Any = js.native
  var _sectionCount: js.Any = js.native
  var _sections: js.Any = js.native
  var _totalSize: js.Any = js.native
  /**
    * Get the base size of sections in the list.
    *
    * #### Complexity
    * Constant.
    */
  /**
    * Set the base size of sections in the list.
    *
    * #### Complexity
    * Linear on the number of resized sections.
    */
  var baseSize: Double = js.native
  /**
    * The total number of sections in the list.
    *
    * #### Complexity
    * Constant.
    */
  val sectionCount: Double = js.native
  /**
    * The total size of all sections in the list.
    *
    * #### Complexity
    * Constant.
    */
  val totalSize: Double = js.native
  /**
    * Remove all sections from the list.
    *
    * #### Complexity
    * Constant.
    */
  def clear(): Unit = js.native
  /**
    * Insert sections into the list.
    *
    * @param index - The index at which to insert the sections. This
    *   value will be clamped to the bounds of the list.
    *
    * @param count - The number of sections to insert. This method
    *   is a no-op if this value is `<= 0`.
    *
    * #### Undefined Behavior
    * An `index` or `count` which is non-integral.
    *
    * #### Complexity
    * Linear on the number of resized sections.
    */
  def insertSections(index: Double, count: Double): Unit = js.native
  /**
    * Move sections within the list.
    *
    * @param index - The index of the first section to move. This method
    *   is a no-op if this value is out of range.
    *
    * @param count - The number of sections to move. This method is a
    *   no-op if this value is `<= 0`.
    *
    * @param destination - The destination index for the first section.
    *   This value will be clamped to the allowable range.
    *
    * #### Undefined Behavior
    * An `index`, `count`, or `destination` which is non-integral.
    *
    * #### Complexity
    * Linear on the number of moved resized sections.
    */
  def moveSections(index: Double, count: Double, destination: Double): Unit = js.native
  /**
    * Remove sections from the list.
    *
    * @param index - The index of the first section to remove. This
    *   method is a no-op if this value is out of range.
    *
    * @param count - The number of sections to remove. This method
    *   is a no-op if this value is `<= 0`.
    *
    * #### Undefined Behavior
    * An `index` or `count` which is non-integral.
    *
    * #### Complexity
    * Linear on the number of resized sections.
    */
  def removeSections(index: Double, count: Double): Unit = js.native
  /**
    * Reset all modified sections to the base size.
    *
    * #### Complexity
    * Constant.
    */
  def reset(): Unit = js.native
  /**
    * Resize a section in the list.
    *
    * @param index - The index of the section to resize. This method
    *   is a no-op if this value is out of range.
    *
    * @param size - The new size of the section. This value will be
    *   clamped to an integer `>= 0`.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    *
    * #### Complexity
    * Linear on the number of resized sections.
    */
  def resizeSection(index: Double, size: Double): Unit = js.native
  /**
    * Find the index of the section which covers the given offset.
    *
    * @param offset - The offset of the section of interest.
    *
    * @returns The index of the section which covers the given offset,
    *   or `-1` if the offset is out of range.
    *
    * #### Complexity
    * Logarithmic on the number of resized sections.
    */
  def sectionIndex(offset: Double): Double = js.native
  /**
    * Find the offset of the section at the given index.
    *
    * @param index - The index of the section of interest.
    *
    * @returns The offset of the section at the given index, or `-1`
    *   if the index is out of range.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    *
    * #### Complexity
    * Logarithmic on the number of resized sections.
    */
  def sectionOffset(index: Double): Double = js.native
  /**
    * Find the size of the section at the given index.
    *
    * @param index - The index of the section of interest.
    *
    * @returns The size of the section at the given index, or `-1`
    *   if the index is out of range.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    *
    * #### Complexity
    * Logarithmic on the number of resized sections.
    */
  def sectionSize(index: Double): Double = js.native
}

