package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.nextSeo.nextSeoStrings.`associate degree`
import typings.nextSeo.nextSeoStrings.`bachelor degree`
import typings.nextSeo.nextSeoStrings.`high school`
import typings.nextSeo.nextSeoStrings.`no requirements`
import typings.nextSeo.nextSeoStrings.`postgraduate degree`
import typings.nextSeo.nextSeoStrings.`professional certificate`
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldJobPostingMod {
  
  @JSImport("next-seo/lib/jsonld/jobPosting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasTypeKeyOverrideBaseSalaryHiringOrganizationApplicantLocationRequirementsExperienceRequirementsJobLocationRest: JobPostingJsonLdProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideBaseSalaryHiringOrganizationApplicantLocationRequirementsExperienceRequirementsJobLocationRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait EducationalOccupationalCredential extends StObject {
    
    var `@type`: js.UndefOr[typings.nextSeo.nextSeoStrings.EducationalOccupationalCredential | String] = js.undefined
    
    var credentialCategory: (`high school`) | (`associate degree`) | (`bachelor degree`) | (`professional certificate`) | (`postgraduate degree`)
  }
  object EducationalOccupationalCredential {
    
    inline def apply(
      credentialCategory: (`high school`) | (`associate degree`) | (`bachelor degree`) | (`professional certificate`) | (`postgraduate degree`)
    ): EducationalOccupationalCredential = {
      val __obj = js.Dynamic.literal(credentialCategory = credentialCategory.asInstanceOf[js.Any])
      __obj.asInstanceOf[EducationalOccupationalCredential]
    }
    
    extension [Self <: EducationalOccupationalCredential](x: Self) {
      
      inline def `set@type`(value: typings.nextSeo.nextSeoStrings.EducationalOccupationalCredential | String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
      
      inline def setCredentialCategory(
        value: (`high school`) | (`associate degree`) | (`bachelor degree`) | (`professional certificate`) | (`postgraduate degree`)
      ): Self = StObject.set(x, "credentialCategory", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextSeo.nextSeoStrings.FULL_TIME
    - typings.nextSeo.nextSeoStrings.PART_TIME
    - typings.nextSeo.nextSeoStrings.CONTRACTOR
    - typings.nextSeo.nextSeoStrings.TEMPORARY
    - typings.nextSeo.nextSeoStrings.INTERN
    - typings.nextSeo.nextSeoStrings.VOLUNTEER
    - typings.nextSeo.nextSeoStrings.PER_DIEM
    - typings.nextSeo.nextSeoStrings.OTHER
  */
  trait EmploymentType extends StObject
  object EmploymentType {
    
    inline def CONTRACTOR: typings.nextSeo.nextSeoStrings.CONTRACTOR = "CONTRACTOR".asInstanceOf[typings.nextSeo.nextSeoStrings.CONTRACTOR]
    
    inline def FULL_TIME: typings.nextSeo.nextSeoStrings.FULL_TIME = "FULL_TIME".asInstanceOf[typings.nextSeo.nextSeoStrings.FULL_TIME]
    
    inline def INTERN: typings.nextSeo.nextSeoStrings.INTERN = "INTERN".asInstanceOf[typings.nextSeo.nextSeoStrings.INTERN]
    
    inline def OTHER: typings.nextSeo.nextSeoStrings.OTHER = "OTHER".asInstanceOf[typings.nextSeo.nextSeoStrings.OTHER]
    
    inline def PART_TIME: typings.nextSeo.nextSeoStrings.PART_TIME = "PART_TIME".asInstanceOf[typings.nextSeo.nextSeoStrings.PART_TIME]
    
    inline def PER_DIEM: typings.nextSeo.nextSeoStrings.PER_DIEM = "PER_DIEM".asInstanceOf[typings.nextSeo.nextSeoStrings.PER_DIEM]
    
    inline def TEMPORARY: typings.nextSeo.nextSeoStrings.TEMPORARY = "TEMPORARY".asInstanceOf[typings.nextSeo.nextSeoStrings.TEMPORARY]
    
    inline def VOLUNTEER: typings.nextSeo.nextSeoStrings.VOLUNTEER = "VOLUNTEER".asInstanceOf[typings.nextSeo.nextSeoStrings.VOLUNTEER]
  }
  
  trait ExperienceRequirements extends StObject {
    
    var educational: js.UndefOr[EducationalOccupationalCredential] = js.undefined
    
    var experienceInPlaceOfEducation: js.UndefOr[Boolean] = js.undefined
    
    var occupational: js.UndefOr[OccupationalExperienceRequirements] = js.undefined
  }
  object ExperienceRequirements {
    
    inline def apply(): ExperienceRequirements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExperienceRequirements]
    }
    
    extension [Self <: ExperienceRequirements](x: Self) {
      
      inline def setEducational(value: EducationalOccupationalCredential): Self = StObject.set(x, "educational", value.asInstanceOf[js.Any])
      
      inline def setEducationalUndefined: Self = StObject.set(x, "educational", js.undefined)
      
      inline def setExperienceInPlaceOfEducation(value: Boolean): Self = StObject.set(x, "experienceInPlaceOfEducation", value.asInstanceOf[js.Any])
      
      inline def setExperienceInPlaceOfEducationUndefined: Self = StObject.set(x, "experienceInPlaceOfEducation", js.undefined)
      
      inline def setOccupational(value: OccupationalExperienceRequirements): Self = StObject.set(x, "occupational", value.asInstanceOf[js.Any])
      
      inline def setOccupationalUndefined: Self = StObject.set(x, "occupational", js.undefined)
    }
  }
  
  trait HiringOrganization extends StObject {
    
    var logo: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var sameAs: String
  }
  object HiringOrganization {
    
    inline def apply(name: String, sameAs: String): HiringOrganization = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sameAs = sameAs.asInstanceOf[js.Any])
      __obj.asInstanceOf[HiringOrganization]
    }
    
    extension [Self <: HiringOrganization](x: Self) {
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobPostingJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var applicantLocationRequirements: js.UndefOr[String] = js.undefined
    
    var baseSalary: js.UndefOr[MonetaryAmount] = js.undefined
    
    var datePosted: String
    
    var description: String
    
    var employmentType: js.UndefOr[EmploymentType | js.Array[EmploymentType]] = js.undefined
    
    var experienceRequirements: js.UndefOr[ExperienceRequirements] = js.undefined
    
    var hiringOrganization: HiringOrganization
    
    var jobLocation: js.UndefOr[Place] = js.undefined
    
    var jobLocationType: js.UndefOr[String] = js.undefined
    
    var keyOverride: js.UndefOr[String] = js.undefined
    
    var title: String
    
    var validThrough: String
  }
  object JobPostingJsonLdProps {
    
    inline def apply(
      datePosted: String,
      description: String,
      hiringOrganization: HiringOrganization,
      title: String,
      validThrough: String
    ): JobPostingJsonLdProps = {
      val __obj = js.Dynamic.literal(datePosted = datePosted.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hiringOrganization = hiringOrganization.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], validThrough = validThrough.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobPostingJsonLdProps]
    }
    
    extension [Self <: JobPostingJsonLdProps](x: Self) {
      
      inline def setApplicantLocationRequirements(value: String): Self = StObject.set(x, "applicantLocationRequirements", value.asInstanceOf[js.Any])
      
      inline def setApplicantLocationRequirementsUndefined: Self = StObject.set(x, "applicantLocationRequirements", js.undefined)
      
      inline def setBaseSalary(value: MonetaryAmount): Self = StObject.set(x, "baseSalary", value.asInstanceOf[js.Any])
      
      inline def setBaseSalaryUndefined: Self = StObject.set(x, "baseSalary", js.undefined)
      
      inline def setDatePosted(value: String): Self = StObject.set(x, "datePosted", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEmploymentType(value: EmploymentType | js.Array[EmploymentType]): Self = StObject.set(x, "employmentType", value.asInstanceOf[js.Any])
      
      inline def setEmploymentTypeUndefined: Self = StObject.set(x, "employmentType", js.undefined)
      
      inline def setEmploymentTypeVarargs(value: EmploymentType*): Self = StObject.set(x, "employmentType", js.Array(value*))
      
      inline def setExperienceRequirements(value: ExperienceRequirements): Self = StObject.set(x, "experienceRequirements", value.asInstanceOf[js.Any])
      
      inline def setExperienceRequirementsUndefined: Self = StObject.set(x, "experienceRequirements", js.undefined)
      
      inline def setHiringOrganization(value: HiringOrganization): Self = StObject.set(x, "hiringOrganization", value.asInstanceOf[js.Any])
      
      inline def setJobLocation(value: Place): Self = StObject.set(x, "jobLocation", value.asInstanceOf[js.Any])
      
      inline def setJobLocationType(value: String): Self = StObject.set(x, "jobLocationType", value.asInstanceOf[js.Any])
      
      inline def setJobLocationTypeUndefined: Self = StObject.set(x, "jobLocationType", js.undefined)
      
      inline def setJobLocationUndefined: Self = StObject.set(x, "jobLocation", js.undefined)
      
      inline def setKeyOverride(value: String): Self = StObject.set(x, "keyOverride", value.asInstanceOf[js.Any])
      
      inline def setKeyOverrideUndefined: Self = StObject.set(x, "keyOverride", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValidThrough(value: String): Self = StObject.set(x, "validThrough", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonetaryAmount extends StObject {
    
    var currency: String
    
    var unitText: UnitTextType
    
    var value: Double | (js.Tuple2[Double, Double])
  }
  object MonetaryAmount {
    
    inline def apply(currency: String, unitText: UnitTextType, value: Double | (js.Tuple2[Double, Double])): MonetaryAmount = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], unitText = unitText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonetaryAmount]
    }
    
    extension [Self <: MonetaryAmount](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setUnitText(value: UnitTextType): Self = StObject.set(x, "unitText", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OccupationalExperienceRequirements extends StObject {
    
    var `@type`: js.UndefOr[
        typings.nextSeo.nextSeoStrings.OccupationalExperienceRequirements | (`no requirements`) | String
      ] = js.undefined
    
    var minimumMonthsOfExperience: Double
  }
  object OccupationalExperienceRequirements {
    
    inline def apply(minimumMonthsOfExperience: Double): OccupationalExperienceRequirements = {
      val __obj = js.Dynamic.literal(minimumMonthsOfExperience = minimumMonthsOfExperience.asInstanceOf[js.Any])
      __obj.asInstanceOf[OccupationalExperienceRequirements]
    }
    
    extension [Self <: OccupationalExperienceRequirements](x: Self) {
      
      inline def `set@type`(
        value: typings.nextSeo.nextSeoStrings.OccupationalExperienceRequirements | (`no requirements`) | String
      ): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
      
      inline def setMinimumMonthsOfExperience(value: Double): Self = StObject.set(x, "minimumMonthsOfExperience", value.asInstanceOf[js.Any])
    }
  }
  
  trait Place extends StObject {
    
    var addressCountry: String
    
    var addressLocality: String
    
    var addressRegion: String
    
    var postalCode: String
    
    var streetAddress: String
  }
  object Place {
    
    inline def apply(
      addressCountry: String,
      addressLocality: String,
      addressRegion: String,
      postalCode: String,
      streetAddress: String
    ): Place = {
      val __obj = js.Dynamic.literal(addressCountry = addressCountry.asInstanceOf[js.Any], addressLocality = addressLocality.asInstanceOf[js.Any], addressRegion = addressRegion.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Place]
    }
    
    extension [Self <: Place](x: Self) {
      
      inline def setAddressCountry(value: String): Self = StObject.set(x, "addressCountry", value.asInstanceOf[js.Any])
      
      inline def setAddressLocality(value: String): Self = StObject.set(x, "addressLocality", value.asInstanceOf[js.Any])
      
      inline def setAddressRegion(value: String): Self = StObject.set(x, "addressRegion", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextSeo.nextSeoStrings.HOUR
    - typings.nextSeo.nextSeoStrings.DAY
    - typings.nextSeo.nextSeoStrings.WEEK
    - typings.nextSeo.nextSeoStrings.MONTH
    - typings.nextSeo.nextSeoStrings.YEAR
  */
  trait UnitTextType extends StObject
  object UnitTextType {
    
    inline def DAY: typings.nextSeo.nextSeoStrings.DAY = "DAY".asInstanceOf[typings.nextSeo.nextSeoStrings.DAY]
    
    inline def HOUR: typings.nextSeo.nextSeoStrings.HOUR = "HOUR".asInstanceOf[typings.nextSeo.nextSeoStrings.HOUR]
    
    inline def MONTH: typings.nextSeo.nextSeoStrings.MONTH = "MONTH".asInstanceOf[typings.nextSeo.nextSeoStrings.MONTH]
    
    inline def WEEK: typings.nextSeo.nextSeoStrings.WEEK = "WEEK".asInstanceOf[typings.nextSeo.nextSeoStrings.WEEK]
    
    inline def YEAR: typings.nextSeo.nextSeoStrings.YEAR = "YEAR".asInstanceOf[typings.nextSeo.nextSeoStrings.YEAR]
  }
}
