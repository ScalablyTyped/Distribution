package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TermStore {
  
  trait Group
    extends StObject
       with Entity {
    
    // Date and time of the group creation. Read-only.
    var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
    
    // Description that gives details on the term usage.
    var description: js.UndefOr[NullableOption[String]] = js.undefined
    
    // Name of the group.
    var displayName: js.UndefOr[NullableOption[String]] = js.undefined
    
    // ID of the parent site of this group.
    var parentSiteId: js.UndefOr[NullableOption[String]] = js.undefined
    
    // Returns the type of the group. Possible values are global, system, and siteCollection.
    var scope: js.UndefOr[NullableOption[TermGroupScope]] = js.undefined
    
    // All sets under the group in a term [store].
    var sets: js.UndefOr[NullableOption[js.Array[Set]]] = js.undefined
  }
  object Group {
    
    inline def apply(): typings.microsoftGraph.mod.TermStore.Group = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.microsoftGraph.mod.TermStore.Group]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.microsoftGraph.mod.TermStore.Group] (val x: Self) extends AnyVal {
      
      inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
      
      inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
      
      inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setParentSiteId(value: NullableOption[String]): Self = StObject.set(x, "parentSiteId", value.asInstanceOf[js.Any])
      
      inline def setParentSiteIdNull: Self = StObject.set(x, "parentSiteId", null)
      
      inline def setParentSiteIdUndefined: Self = StObject.set(x, "parentSiteId", js.undefined)
      
      inline def setScope(value: NullableOption[TermGroupScope]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeNull: Self = StObject.set(x, "scope", null)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSets(value: NullableOption[js.Array[Set]]): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
      
      inline def setSetsNull: Self = StObject.set(x, "sets", null)
      
      inline def setSetsUndefined: Self = StObject.set(x, "sets", js.undefined)
      
      inline def setSetsVarargs(value: Set*): Self = StObject.set(x, "sets", js.Array(value*))
    }
  }
  
  trait LocalizedDescription extends StObject {
    
    // The description in the localized language.
    var description: js.UndefOr[NullableOption[String]] = js.undefined
    
    // The language tag for the label.
    var languageTag: js.UndefOr[NullableOption[String]] = js.undefined
  }
  object LocalizedDescription {
    
    inline def apply(): LocalizedDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalizedDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalizedDescription] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLanguageTag(value: NullableOption[String]): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
      
      inline def setLanguageTagNull: Self = StObject.set(x, "languageTag", null)
      
      inline def setLanguageTagUndefined: Self = StObject.set(x, "languageTag", js.undefined)
    }
  }
  
  trait LocalizedLabel extends StObject {
    
    // Indicates whether the label is the default label.
    var isDefault: js.UndefOr[NullableOption[Boolean]] = js.undefined
    
    // The language tag for the label.
    var languageTag: js.UndefOr[NullableOption[String]] = js.undefined
    
    // The name of the label.
    var name: js.UndefOr[NullableOption[String]] = js.undefined
  }
  object LocalizedLabel {
    
    inline def apply(): LocalizedLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalizedLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalizedLabel] (val x: Self) extends AnyVal {
      
      inline def setIsDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
      
      inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
      
      inline def setLanguageTag(value: NullableOption[String]): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
      
      inline def setLanguageTagNull: Self = StObject.set(x, "languageTag", null)
      
      inline def setLanguageTagUndefined: Self = StObject.set(x, "languageTag", js.undefined)
      
      inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait LocalizedName extends StObject {
    
    // The language tag for the label.
    var languageTag: js.UndefOr[NullableOption[String]] = js.undefined
    
    // The name in the localized language.
    var name: js.UndefOr[NullableOption[String]] = js.undefined
  }
  object LocalizedName {
    
    inline def apply(): LocalizedName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalizedName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalizedName] (val x: Self) extends AnyVal {
      
      inline def setLanguageTag(value: NullableOption[String]): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
      
      inline def setLanguageTagNull: Self = StObject.set(x, "languageTag", null)
      
      inline def setLanguageTagUndefined: Self = StObject.set(x, "languageTag", js.undefined)
      
      inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Relation
    extends StObject
       with Entity {
    
    /**
      * The from [term] of the relation. The term from which the relationship is defined. A null value would indicate the
      * relation is directly with the [set].
      */
    var fromTerm: js.UndefOr[NullableOption[Term]] = js.undefined
    
    // The type of relation. Possible values are: pin, reuse.
    var relationship: js.UndefOr[NullableOption[RelationType]] = js.undefined
    
    // The [set] in which the relation is relevant.
    var set: js.UndefOr[NullableOption[Set]] = js.undefined
    
    // The to [term] of the relation. The term to which the relationship is defined.
    var toTerm: js.UndefOr[NullableOption[Term]] = js.undefined
  }
  object Relation {
    
    inline def apply(): Relation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Relation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Relation] (val x: Self) extends AnyVal {
      
      inline def setFromTerm(value: NullableOption[Term]): Self = StObject.set(x, "fromTerm", value.asInstanceOf[js.Any])
      
      inline def setFromTermNull: Self = StObject.set(x, "fromTerm", null)
      
      inline def setFromTermUndefined: Self = StObject.set(x, "fromTerm", js.undefined)
      
      inline def setRelationship(value: NullableOption[RelationType]): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
      
      inline def setRelationshipNull: Self = StObject.set(x, "relationship", null)
      
      inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
      
      inline def setSet(value: NullableOption[Set]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetNull: Self = StObject.set(x, "set", null)
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setToTerm(value: NullableOption[Term]): Self = StObject.set(x, "toTerm", value.asInstanceOf[js.Any])
      
      inline def setToTermNull: Self = StObject.set(x, "toTerm", null)
      
      inline def setToTermUndefined: Self = StObject.set(x, "toTerm", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.microsoftGraph.microsoftGraphStrings.pin
    - typings.microsoftGraph.microsoftGraphStrings.reuse
    - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
  */
  trait RelationType extends StObject
  object RelationType {
    
    inline def pin: typings.microsoftGraph.microsoftGraphStrings.pin = "pin".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.pin]
    
    inline def reuse: typings.microsoftGraph.microsoftGraphStrings.reuse = "reuse".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.reuse]
    
    inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
  }
  
  trait Set
    extends StObject
       with Entity {
    
    // Children terms of set in term [store].
    var children: js.UndefOr[NullableOption[js.Array[Term]]] = js.undefined
    
    // Date and time of set creation. Read-only.
    var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
    
    // Description that gives details on the term usage.
    var description: js.UndefOr[NullableOption[String]] = js.undefined
    
    // Name of the set for each languageTag.
    var localizedNames: js.UndefOr[NullableOption[js.Array[LocalizedName]]] = js.undefined
    
    // The parent [group] that contains the set.
    var parentGroup: js.UndefOr[typings.microsoftGraph.mod.TermStore.Group] = js.undefined
    
    // Custom properties for the set.
    var properties: js.UndefOr[NullableOption[js.Array[KeyValue]]] = js.undefined
    
    // Indicates which terms have been pinned or reused directly under the set.
    var relations: js.UndefOr[NullableOption[js.Array[Relation]]] = js.undefined
    
    // All the terms under the set.
    var terms: js.UndefOr[NullableOption[js.Array[Term]]] = js.undefined
  }
  object Set {
    
    inline def apply(): Set = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Set]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: NullableOption[js.Array[Term]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Term*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
      
      inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
      
      inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLocalizedNames(value: NullableOption[js.Array[LocalizedName]]): Self = StObject.set(x, "localizedNames", value.asInstanceOf[js.Any])
      
      inline def setLocalizedNamesNull: Self = StObject.set(x, "localizedNames", null)
      
      inline def setLocalizedNamesUndefined: Self = StObject.set(x, "localizedNames", js.undefined)
      
      inline def setLocalizedNamesVarargs(value: LocalizedName*): Self = StObject.set(x, "localizedNames", js.Array(value*))
      
      inline def setParentGroup(value: typings.microsoftGraph.mod.TermStore.Group): Self = StObject.set(x, "parentGroup", value.asInstanceOf[js.Any])
      
      inline def setParentGroupUndefined: Self = StObject.set(x, "parentGroup", js.undefined)
      
      inline def setProperties(value: NullableOption[js.Array[KeyValue]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: KeyValue*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setRelations(value: NullableOption[js.Array[Relation]]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
      
      inline def setRelationsNull: Self = StObject.set(x, "relations", null)
      
      inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
      
      inline def setRelationsVarargs(value: Relation*): Self = StObject.set(x, "relations", js.Array(value*))
      
      inline def setTerms(value: NullableOption[js.Array[Term]]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
      
      inline def setTermsNull: Self = StObject.set(x, "terms", null)
      
      inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
      
      inline def setTermsVarargs(value: Term*): Self = StObject.set(x, "terms", js.Array(value*))
    }
  }
  
  trait Store
    extends StObject
       with Entity {
    
    // Default language of the term store.
    var defaultLanguageTag: js.UndefOr[String] = js.undefined
    
    // Collection of all groups available in the term store.
    var groups: js.UndefOr[NullableOption[js.Array[typings.microsoftGraph.mod.TermStore.Group]]] = js.undefined
    
    // List of languages for the term store.
    var languageTags: js.UndefOr[js.Array[String]] = js.undefined
    
    // Collection of all sets available in the term store.
    var sets: js.UndefOr[NullableOption[js.Array[Set]]] = js.undefined
  }
  object Store {
    
    inline def apply(): Store = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      inline def setDefaultLanguageTag(value: String): Self = StObject.set(x, "defaultLanguageTag", value.asInstanceOf[js.Any])
      
      inline def setDefaultLanguageTagUndefined: Self = StObject.set(x, "defaultLanguageTag", js.undefined)
      
      inline def setGroups(value: NullableOption[js.Array[typings.microsoftGraph.mod.TermStore.Group]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsNull: Self = StObject.set(x, "groups", null)
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: typings.microsoftGraph.mod.TermStore.Group*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setLanguageTags(value: js.Array[String]): Self = StObject.set(x, "languageTags", value.asInstanceOf[js.Any])
      
      inline def setLanguageTagsUndefined: Self = StObject.set(x, "languageTags", js.undefined)
      
      inline def setLanguageTagsVarargs(value: String*): Self = StObject.set(x, "languageTags", js.Array(value*))
      
      inline def setSets(value: NullableOption[js.Array[Set]]): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
      
      inline def setSetsNull: Self = StObject.set(x, "sets", null)
      
      inline def setSetsUndefined: Self = StObject.set(x, "sets", js.undefined)
      
      inline def setSetsVarargs(value: Set*): Self = StObject.set(x, "sets", js.Array(value*))
    }
  }
  
  trait Term
    extends StObject
       with Entity {
    
    // Children of current term.
    var children: js.UndefOr[NullableOption[js.Array[Term]]] = js.undefined
    
    // Date and time of term creation. Read-only.
    var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
    
    // Description about term that is dependent on the languageTag.
    var descriptions: js.UndefOr[NullableOption[js.Array[LocalizedDescription]]] = js.undefined
    
    // Label metadata for a term.
    var labels: js.UndefOr[NullableOption[js.Array[LocalizedLabel]]] = js.undefined
    
    // Last date and time of term modification. Read-only.
    var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
    
    // Collection of properties on the term.
    var properties: js.UndefOr[NullableOption[js.Array[KeyValue]]] = js.undefined
    
    // To indicate which terms are related to the current term as either pinned or reused.
    var relations: js.UndefOr[NullableOption[js.Array[Relation]]] = js.undefined
    
    // The [set] in which the term is created.
    var set: js.UndefOr[NullableOption[Set]] = js.undefined
  }
  object Term {
    
    inline def apply(): Term = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Term]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Term] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: NullableOption[js.Array[Term]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Term*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
      
      inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
      
      inline def setDescriptions(value: NullableOption[js.Array[LocalizedDescription]]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      inline def setDescriptionsNull: Self = StObject.set(x, "descriptions", null)
      
      inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
      
      inline def setDescriptionsVarargs(value: LocalizedDescription*): Self = StObject.set(x, "descriptions", js.Array(value*))
      
      inline def setLabels(value: NullableOption[js.Array[LocalizedLabel]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsNull: Self = StObject.set(x, "labels", null)
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: LocalizedLabel*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
      
      inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
      
      inline def setProperties(value: NullableOption[js.Array[KeyValue]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: KeyValue*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setRelations(value: NullableOption[js.Array[Relation]]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
      
      inline def setRelationsNull: Self = StObject.set(x, "relations", null)
      
      inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
      
      inline def setRelationsVarargs(value: Relation*): Self = StObject.set(x, "relations", js.Array(value*))
      
      inline def setSet(value: NullableOption[Set]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetNull: Self = StObject.set(x, "set", null)
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.microsoftGraph.microsoftGraphStrings.global
    - typings.microsoftGraph.microsoftGraphStrings.system
    - typings.microsoftGraph.microsoftGraphStrings.siteCollection
    - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
  */
  trait TermGroupScope extends StObject
  object TermGroupScope {
    
    inline def global: typings.microsoftGraph.microsoftGraphStrings.global = "global".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.global]
    
    inline def siteCollection: typings.microsoftGraph.microsoftGraphStrings.siteCollection = "siteCollection".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.siteCollection]
    
    inline def system: typings.microsoftGraph.microsoftGraphStrings.system = "system".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.system]
    
    inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
  }
}
