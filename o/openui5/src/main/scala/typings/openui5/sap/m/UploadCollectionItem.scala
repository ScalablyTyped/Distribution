package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Element
import typings.openui5.sap.ui.unified.FileUploader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadCollectionItem extends Element {
  
  /**
    * Adds some attribute to the aggregation <code>attributes</code>.
    * @since 1.30
    * @param oAttribute the attribute to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAttribute(oAttribute: ObjectAttribute): UploadCollectionItem = js.native
  
  /**
    * Adds some marker to the aggregation <code>markers</code>.
    * @since 1.40
    * @param oMarker the marker to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addMarker(oMarker: ObjectMarker): UploadCollectionItem = js.native
  
  /**
    * Adds some status to the aggregation <code>statuses</code>.
    * @since 1.30
    * @param oStatus the status to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addStatus(oStatus: ObjectStatus): UploadCollectionItem = js.native
  
  /**
    * Binds aggregation <code>attributes</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.30
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindAttributes(oBindingInfo: js.Any): UploadCollectionItem = js.native
  
  /**
    * Binds aggregation <code>markers</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.40
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindMarkers(oBindingInfo: js.Any): UploadCollectionItem = js.native
  
  /**
    * Binds aggregation <code>statuses</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.30
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindStatuses(oBindingInfo: js.Any): UploadCollectionItem = js.native
  
  /**
    * Destroys all the attributes in the aggregation <code>attributes</code>.
    * @since 1.30
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyAttributes(): UploadCollectionItem = js.native
  
  /**
    * Destroys all the markers in the aggregation <code>markers</code>.
    * @since 1.40
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyMarkers(): UploadCollectionItem = js.native
  
  /**
    * Destroys all the statuses in the aggregation <code>statuses</code>.
    * @since 1.30
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyStatuses(): UploadCollectionItem = js.native
  
  /**
    * Downloads the item.The sap.ui.core.util.File method is used here. For further details on this
    * method, see {sap.ui.core.util.File.save}.
    * @since 1.36.0
    * @param askForLocation Decides whether to ask for a location to download or not.
    */
  def download(askForLocation: Boolean): Unit = js.native
  
  /**
    * Gets current value of property <code>ariaLabelForPicture</code>.Aria label for the icon (or for the
    * image).
    * @returns Value of property <code>ariaLabelForPicture</code>
    */
  def getAriaLabelForPicture(): String = js.native
  
  /**
    * Gets content of aggregation <code>attributes</code>.Attributes of an uploaded item, for example,
    * 'Uploaded By', 'Uploaded On', 'File Size'attributes are displayed after an item has been
    * uploaded.Additionally, the Active property of sap.m.ObjectAttribute is supported.<br>Note that if
    * one of the deprecated properties contributor, fileSize or UploadedDate is filled in addition to this
    * attribute, two attributes with the same titleare displayed as these properties get displayed as an
    * attribute.Example: An application passes the property ‘contributor’ with the value ‘A’ and the
    * aggregation attributes ‘contributor’: ‘B’. As a result, the attributes‘contributor’:’A’ and
    * ‘contributor’:’B’ are displayed. To make sure the title does not appear twice, check if one of the
    * properties is filled.
    * @since 1.30
    */
  def getAttributes(): js.Array[ObjectAttribute] = js.native
  
  /**
    * Gets current value of property <code>contributor</code>.Specifies the name of the user who uploaded
    * the file.
    * @returns Value of property <code>contributor</code>
    */
  def getContributor(): String = js.native
  
  /**
    * Gets current value of property <code>documentId</code>.Specifies a unique identifier of the file
    * (created by the application).
    * @returns Value of property <code>documentId</code>
    */
  def getDocumentId(): String = js.native
  
  /**
    * Gets current value of property <code>enableDelete</code>.Enables/Disables the Edit button.If the
    * value is true, the Edit button is enabled and the edit function can be used.If the value is false,
    * the edit function is not available.Default value is <code>true</code>.
    * @returns Value of property <code>enableDelete</code>
    */
  def getEnableDelete(): Boolean = js.native
  
  /**
    * Gets current value of property <code>enableEdit</code>.Enables/Disables the Edit button.If the value
    * is true, the Edit button is enabled and the edit function can be used.If the value is false, the
    * edit function is not available.Default value is <code>true</code>.
    * @returns Value of property <code>enableEdit</code>
    */
  def getEnableEdit(): Boolean = js.native
  
  /**
    * Gets current value of property <code>fileName</code>.Specifies the name of the uploaded file.
    * @returns Value of property <code>fileName</code>
    */
  def getFileName(): String = js.native
  
  /**
    * Gets current value of property <code>fileSize</code>.Specifies the size of the uploaded file (in
    * megabytes).
    * @returns Value of property <code>fileSize</code>
    */
  def getFileSize(): Double = js.native
  
  /**
    * ID of the element which is the current target of the association <code>fileUploader</code>, or
    * <code>null</code>.
    */
  def getFileUploader(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>markers</code>.Markers of an uploaded itemMarkers will be
    * displayed after an item has been uploadedBut not in Edit mode
    * @since 1.40
    */
  def getMarkers(): js.Array[ObjectMarker] = js.native
  
  /**
    * Gets current value of property <code>mimeType</code>.Specifies the MIME type of the file.
    * @returns Value of property <code>mimeType</code>
    */
  def getMimeType(): String = js.native
  
  /**
    * Gets current value of property <code>selected</code>.Defines the selected state of the
    * UploadCollectionItem.Default value is <code>false</code>.
    * @since 1.34
    * @returns Value of property <code>selected</code>
    */
  def getSelected(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>statuses</code>.Statuses of an uploaded itemStatuses will be
    * displayed after an item has been uploaded
    * @since 1.30
    */
  def getStatuses(): js.Array[ObjectStatus] = js.native
  
  /**
    * Gets current value of property <code>thumbnailUrl</code>.Specifies the URL where the thumbnail of
    * the file is located.
    * @returns Value of property <code>thumbnailUrl</code>
    */
  def getThumbnailUrl(): String = js.native
  
  /**
    * Gets current value of property <code>uploadedDate</code>.Specifies the date on which the file was
    * uploaded.The application has to define the date format.
    * @returns Value of property <code>uploadedDate</code>
    */
  def getUploadedDate(): String = js.native
  
  /**
    * Gets current value of property <code>url</code>.Specifies the URL where the file is located.If the
    * application doesn't provide a value for this property, the icon and the file name of the
    * UploadCollectionItem are not clickable.
    * @returns Value of property <code>url</code>
    */
  def getUrl(): String = js.native
  
  /**
    * Gets current value of property <code>visibleDelete</code>.Show/Hide the Delete button.If the value
    * is true, the Delete button is visible.If the value is false, the Delete button is not
    * visible.Default value is <code>true</code>.
    * @returns Value of property <code>visibleDelete</code>
    */
  def getVisibleDelete(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visibleEdit</code>.Show/Hide the Edit button.If the value is
    * true, the Edit button is visible.If the value is false, the Edit button is not visible.Default value
    * is <code>true</code>.
    * @returns Value of property <code>visibleEdit</code>
    */
  def getVisibleEdit(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.m.ObjectAttribute</code> in the aggregation
    * <code>attributes</code>.and returns its index if found or -1 otherwise.
    * @since 1.30
    * @param oAttribute The attribute whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfAttribute(oAttribute: ObjectAttribute): Double = js.native
  
  /**
    * Checks for the provided <code>sap.m.ObjectMarker</code> in the aggregation <code>markers</code>.and
    * returns its index if found or -1 otherwise.
    * @since 1.40
    * @param oMarker The marker whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfMarker(oMarker: ObjectMarker): Double = js.native
  
  /**
    * Checks for the provided <code>sap.m.ObjectStatus</code> in the aggregation <code>statuses</code>.and
    * returns its index if found or -1 otherwise.
    * @since 1.30
    * @param oStatus The status whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfStatus(oStatus: ObjectStatus): Double = js.native
  
  /**
    * Inserts a attribute into the aggregation <code>attributes</code>.
    * @since 1.30
    * @param oAttribute the attribute to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the attribute should be inserted at; for             a
    * negative value of <code>iIndex</code>, the attribute is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the attribute is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertAttribute(oAttribute: ObjectAttribute, iIndex: Double): UploadCollectionItem = js.native
  
  /**
    * Inserts a marker into the aggregation <code>markers</code>.
    * @since 1.40
    * @param oMarker the marker to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the marker should be inserted at; for             a
    * negative value of <code>iIndex</code>, the marker is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the marker is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertMarker(oMarker: ObjectMarker, iIndex: Double): UploadCollectionItem = js.native
  
  /**
    * Inserts a status into the aggregation <code>statuses</code>.
    * @since 1.30
    * @param oStatus the status to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the status should be inserted at; for             a
    * negative value of <code>iIndex</code>, the status is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the status is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertStatus(oStatus: ObjectStatus, iIndex: Double): UploadCollectionItem = js.native
  
  /**
    * Removes all the controls from the aggregation <code>attributes</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.30
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAttributes(): js.Array[ObjectAttribute] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>markers</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @since 1.40
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllMarkers(): js.Array[ObjectMarker] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>statuses</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.30
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllStatuses(): js.Array[ObjectStatus] = js.native
  
  def removeAttribute(vAttribute: String): ObjectAttribute = js.native
  /**
    * Removes a attribute from the aggregation <code>attributes</code>.
    * @since 1.30
    * @param vAttribute The attribute to remove or its index or id
    * @returns The removed attribute or <code>null</code>
    */
  def removeAttribute(vAttribute: Double): ObjectAttribute = js.native
  def removeAttribute(vAttribute: ObjectAttribute): ObjectAttribute = js.native
  
  def removeMarker(vMarker: String): ObjectMarker = js.native
  /**
    * Removes a marker from the aggregation <code>markers</code>.
    * @since 1.40
    * @param vMarker The marker to remove or its index or id
    * @returns The removed marker or <code>null</code>
    */
  def removeMarker(vMarker: Double): ObjectMarker = js.native
  def removeMarker(vMarker: ObjectMarker): ObjectMarker = js.native
  
  def removeStatus(vStatus: String): ObjectStatus = js.native
  /**
    * Removes a status from the aggregation <code>statuses</code>.
    * @since 1.30
    * @param vStatus The status to remove or its index or id
    * @returns The removed status or <code>null</code>
    */
  def removeStatus(vStatus: Double): ObjectStatus = js.native
  def removeStatus(vStatus: ObjectStatus): ObjectStatus = js.native
  
  /**
    * Sets a new value for property <code>ariaLabelForPicture</code>.Aria label for the icon (or for the
    * image).When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sAriaLabelForPicture New value for property <code>ariaLabelForPicture</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAriaLabelForPicture(sAriaLabelForPicture: String): UploadCollectionItem = js.native
  
  /**
    * Setter of the deprecated contributor property. The property is mapped to the aggregation attributes.
    */
  def setContributor(): Unit = js.native
  
  /**
    * Sets a new value for property <code>documentId</code>.Specifies a unique identifier of the file
    * (created by the application).When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sDocumentId New value for property <code>documentId</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDocumentId(sDocumentId: String): UploadCollectionItem = js.native
  
  /**
    * Sets a new value for property <code>enableDelete</code>.Enables/Disables the Edit button.If the
    * value is true, the Edit button is enabled and the edit function can be used.If the value is false,
    * the edit function is not available.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bEnableDelete New value for property <code>enableDelete</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnableDelete(bEnableDelete: Boolean): UploadCollectionItem = js.native
  
  /**
    * Sets a new value for property <code>enableEdit</code>.Enables/Disables the Edit button.If the value
    * is true, the Edit button is enabled and the edit function can be used.If the value is false, the
    * edit function is not available.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bEnableEdit New value for property <code>enableEdit</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnableEdit(bEnableEdit: Boolean): UploadCollectionItem = js.native
  
  /**
    * Sets a new value for property <code>fileName</code>.Specifies the name of the uploaded file.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sFileName New value for property <code>fileName</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFileName(sFileName: String): UploadCollectionItem = js.native
  
  /**
    * Setter of the deprecated fileSize property. The property is mapped to the aggregation attributes.
    */
  def setFileSize(): Unit = js.native
  
  /**
    * Sets the associated <code>fileUploader</code>.
    * @param oFileUploader ID of an element which becomes the new target of this fileUploader association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFileUploader(oFileUploader: js.Any): UploadCollectionItem = js.native
  def setFileUploader(oFileUploader: FileUploader): UploadCollectionItem = js.native
  
  /**
    * Sets a new value for property <code>mimeType</code>.Specifies the MIME type of the file.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sMimeType New value for property <code>mimeType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMimeType(sMimeType: String): UploadCollectionItem = js.native
  
  /**
    * Setter of the selected property.
    * @since 1.34
    * @param selected value to set on Selected property
    * @returns The current UploadCollectionItem
    */
  def setSelected(selected: Boolean): UploadCollectionItem = js.native
  
  /**
    * Sets a new value for property <code>thumbnailUrl</code>.Specifies the URL where the thumbnail of the
    * file is located.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sThumbnailUrl New value for property <code>thumbnailUrl</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setThumbnailUrl(sThumbnailUrl: String): UploadCollectionItem = js.native
  
  /**
    * Setter of the deprecated uploadedDate property. The property is mapped to the aggregation
    * attributes.
    */
  def setUploadedDate(): Unit = js.native
  
  /**
    * Sets a new value for property <code>url</code>.Specifies the URL where the file is located.If the
    * application doesn't provide a value for this property, the icon and the file name of the
    * UploadCollectionItem are not clickable.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sUrl New value for property <code>url</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUrl(sUrl: String): UploadCollectionItem = js.native
  
  /**
    * Sets a new value for property <code>visibleDelete</code>.Show/Hide the Delete button.If the value is
    * true, the Delete button is visible.If the value is false, the Delete button is not visible.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @param bVisibleDelete New value for property <code>visibleDelete</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleDelete(bVisibleDelete: Boolean): UploadCollectionItem = js.native
  
  /**
    * Sets a new value for property <code>visibleEdit</code>.Show/Hide the Edit button.If the value is
    * true, the Edit button is visible.If the value is false, the Edit button is not visible.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>true</code>.
    * @param bVisibleEdit New value for property <code>visibleEdit</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleEdit(bVisibleEdit: Boolean): UploadCollectionItem = js.native
  
  /**
    * Unbinds aggregation <code>attributes</code> from model data.
    * @since 1.30
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindAttributes(): UploadCollectionItem = js.native
  
  /**
    * Unbinds aggregation <code>markers</code> from model data.
    * @since 1.40
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindMarkers(): UploadCollectionItem = js.native
  
  /**
    * Unbinds aggregation <code>statuses</code> from model data.
    * @since 1.30
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindStatuses(): UploadCollectionItem = js.native
}
